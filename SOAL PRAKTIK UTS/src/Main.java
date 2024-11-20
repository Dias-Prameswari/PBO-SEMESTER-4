import java.text.DecimalFormat;
import java.util.Scanner;

class Produk {
    String kdProduk, nmProduk;
    double hrgBeli, hrgJual;

    void inputProduk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kode Produk: ");
        kdProduk = scanner.nextLine();
        System.out.print("Masukkan Nama Produk: ");
        nmProduk = scanner.nextLine();
        System.out.print("Masukkan Harga Beli: ");
        hrgBeli = scanner.nextDouble();
    }
}

class Agen extends Produk {
    static int counter = 1;
    String jnsByr, ketByr, souvenir, nomorNota;
    int jmlJual;
    double totJual, ppn, bunga, totByr;

    Agen(String cabang) {
        nomorNota = String.format("%30d", counter);
        counter++;
        System.out.println("Agen Aksesoris HP - " + cabang);
    }

    void inputJumlah() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Penjualan: ");
        jmlJual = scanner.nextInt();
    }

    double getHargaJual() {
        if (hrgBeli > 200000)//200k
            hrgJual = hrgBeli + (hrgBeli * 0.01  );
        else if (hrgBeli > 100000)//100k
            hrgJual = hrgBeli + (hrgBeli * 0.15) ;
        else if (hrgBeli > 50000)
            hrgJual = hrgBeli + (hrgBeli * 0.20);
        else if (hrgBeli > 25000)
            hrgJual = hrgBeli + (hrgBeli * 0.30);
        else
            hrgJual = hrgBeli + (hrgBeli * 0.50);

        return hrgJual;
    }

    void inputJenis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jenis Bayar: ");
        System.out.println("1. Cash");
        System.out.println("2. Tempo");
        System.out.print("Pilih jenis bayar (1/2): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            jnsByr = "Cash";
            ketByr = "Pembayaran Tunai";
        } else if (choice == 2) {
            jnsByr = "Tempo";
            ketByr = "Pembayaran Tempo";
            System.out.print("Masukkan Waktu Tempo (dalam bulan): ");
            int waktuTempo = scanner.nextInt();
            if (waktuTempo > 1)
                bunga = 0.05;
        }
    }

    void hitungJual() {
        totJual = hrgJual * jmlJual;
        ppn = 0.11 * totJual;
        totByr = totJual + ppn;
        if (jnsByr.equals("Tempo")) {
            totByr += totByr * bunga;
        }
    }

    void cetak() {

        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("No. Nota:" + String.format("%-20s",nomorNota));
        System.out.println("Kode Produk: " + kdProduk);
        System.out.println("Nama Produk: " + nmProduk);
        System.out.println("Harga Jual: " + df.format(getHargaJual()));
        System.out.println("Jumlah Jual: " + jmlJual);
        System.out.println("Total: " + totJual);
        System.out.println("Jenis Bayar: " + jnsByr);
        System.out.println("Keterangan Bayar : "+ketByr);
        System.out.println("Total Bayar: " + df.format(totByr));
        if (jnsByr.equals("Cash")) {
            if (totByr >= 100000 && totByr <= 500000)
                souvenir = "Mug";
            else if (totByr > 500000 && totByr <= 750000)
                souvenir = "Payung";
            else if (totByr > 750000 && totByr <= 1000000)
                souvenir = "Tas Belanja";
            else if (totByr > 1000000)
                souvenir = "Voucher 100rb";
        }
        System.out.println("Souvenir: " + souvenir);
    }
}

class AgenDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Cabang Agen: ");
        String cabang = scanner.nextLine();

        Agen agen = new Agen(cabang);
        agen.inputProduk();
        agen.inputJumlah();
        agen.getHargaJual();
        agen.inputJenis();
        agen.hitungJual();
        agen.cetak();
    }
}
