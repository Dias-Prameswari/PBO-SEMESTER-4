//praktik 4 soal 1:
import java.util.Scanner;
public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    // Method untuk mengatur data penjualan
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Method untuk menghitung total pembelian
    public float getTotalPembelian() {
        return harga * jumlah;
    }

    // Method untuk mendapatkan bonus
    public String getBonus() {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    // Method untuk mencetak nota
    public void cetakNota() {
        System.out.println("========== NOTA PEMBELIAN ==========");
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Total Pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjualan penjualan = new Penjualan();
        char input;

        do {
            System.out.println("Masukkan kode barang: ");
            String kode = scanner.nextLine();
            System.out.println("Masukkan nama barang: ");
            String nama = scanner.nextLine();
            System.out.println("Masukkan harga barang: ");
            float harga = scanner.nextFloat();
            System.out.println("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();

            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.println("Input data lagi [Y/T] ?");
            input = scanner.next().charAt(0);
            scanner.nextLine(); // Clearing the newline character from buffer
        } while (input == 'Y' || input == 'y');

        System.out.println("Terima kasih!");
        scanner.close();
    }
}
