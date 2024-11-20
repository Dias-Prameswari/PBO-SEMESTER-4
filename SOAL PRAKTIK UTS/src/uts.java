import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Pemasang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        PasangIklan[] pasangIklan = new PasangIklan[3];

        for (int i = 0; i < pasangIklan.length; i++) {
            System.out.println("\nData Iklan ke-" + (i + 1));
//            pasangIklan[i] = new PasangIklan("Agen");
            pasangIklan[i].inputIklan();
            pasangIklan[i].setNota("999999"); // Nota secara otomatis diatur ke 999999
            pasangIklan[i].inputJumlah();
        }

        System.out.println("\nDaftar Iklan Cetak Agen");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-4s %-8s %-12s %-10s %-10s %-7s %-7s %-12s %-10s%n",
                "No.", "Nota", "Produk Iklan", "Tarif", "Jml/Luas", "Durasi", "PPN", "Total Biaya", "Souvenir");
        System.out.println("-----------------------------------------------------------------------------------");

        double totalBiaya = 0;
        for (int i = 0; i < pasangIklan.length; i++) {
            pasangIklan[i].cetak();
            totalBiaya += pasangIklan[i].getTotal();
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-60s %-11s %-11s%n", "***Total***", totalBiaya, "");
        System.out.println("-----------------------------------------------------------------------------------");
    }

    class Iklan {
        protected int kodeIklan;
        protected String nmIklan;
        protected int tarifIklan;

        public void inputIklan() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Kode Produk (1. Iklan Baris / 2. Iklan Display): ");
            kodeIklan = input.nextInt();
            input.nextLine(); // Clear buffer
            System.out.print("Masukkan Nama Produk Iklan: ");
            nmIklan = input.nextLine();
            System.out.print("Masukkan Tarif Iklan: ");
            tarifIklan = input.nextInt();
        }

        public int getTarifIklan() {
            return tarifIklan;
        }
    }

    class PasangIklan extends Iklan {
        private String noNota, nama, alamat;
        private int jmlIklan, durasi, diskon;
        private double biayaIklan, ppn, totBiaya;
        private String souvenir;

        public PasangIklan(String cabang) {
            System.out.println("Iklan Cetak - " + cabang);
        }

        public void setNota(String noNota) {
            this.noNota = noNota;
        }

        public void inputJumlah() {
            Scanner input = new Scanner(System.in);
            if (kodeIklan == 1) {
                System.out.print("Masukkan Jumlah Baris: ");
                jmlIklan = input.nextInt();
            } else if (kodeIklan == 2) {
                System.out.print("Masukkan Luas (mmk): ");
                jmlIklan = input.nextInt(); // disini mmk dipakai untuk merepresentasikan luas
            }
            System.out.print("Masukkan Durasi (hari): ");
            durasi = input.nextInt();
            System.out.print("Masukkan Diskon (%): ");
            diskon = input.nextInt();
        }

        public double getBiayaIklan() {
            biayaIklan = ((double) tarifIklan * jmlIklan) / durasi - diskon;
            return biayaIklan;
        }

        public double getPpn() {
            ppn = 0.1 * biayaIklan;
            return ppn;
        }

        public double getTotal() {
            totBiaya = biayaIklan + ppn;
            return totBiaya;
        }

        public String getSouvenir() {
            if (kodeIklan == 2) {
                if (durasi >= 3 && durasi <= 6)
                    souvenir = "Mug";
                else if (durasi >= 7 && durasi <= 10)
                    souvenir = "Payung";
                else if (durasi >= 11 && durasi <= 14)
                    souvenir = "Tas";
            } else {
                souvenir = "-";
            }
            return souvenir;
        }

        public void cetak() {
            System.out.printf("%-4s %-8s %-12s %-10s %-10s %-7s %-7s %-12s %-10s%n",
                    noNota, nmIklan, tarifIklan, jmlIklan, durasi, ppn, totBiaya, souvenir);
        }
    }


}

