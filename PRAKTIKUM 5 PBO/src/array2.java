//code dari praktik pbo 2
//code tadi dimodifikasi agar dapat menampung data lebih dari satu
//soal latihan 2. praktik 5 pbo
import java.util.Scanner;
public class array2 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah data mahasiswa : ");
        int jumlahdata = input.nextInt();
        input.nextLine();

        Mahasiswa[] mahasiswas = new Mahasiswa[jumlahdata];
        for (int i = 0; i <jumlahdata; i++)
        {
            System.out.println("Masukkan NIM mahasiswa ke- "+(i+1)+ ": ");
            String nim = input.nextLine();

            System.out.println("Masukkan Nama mahasiswa ke- "+(i+1)+ ": ");
            String nama = input.nextLine();

            System.out.println("Masukkan Nilai Tugas mahasiswa ke- "+(i+1)+ ": ");
            int nilaitugas = input.nextInt();

            System.out.println("Masukkan Nilai UTS mahasiswa ke- "+(i+1)+ ": ");
            int nilaiuts = input.nextInt();

            System.out.println("Masukkan Nilai UAS mahasiswa ke- "+(i+1)+ ": ");
            int nilaiuas = input.nextInt();

            input.nextLine();
            mahasiswas[i] = new Mahasiswa(nim,nama,nilaitugas,nilaiuts,nilaiuas);
        }

        System.out.println("Nilai Mahasiswa : ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-20s| %-20s| %-13s| %-10s| %-10s| %-14s| %-13s| %-13s|\n",
                "NIM", "Nama", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Nilai Akhir", "Nilai Huruf", "Predikat");


        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i<jumlahdata; i++)
            {
                System.out.printf("| %-20s| %-20s| %-13d| %-10d| %-10d| %-14s| %-13s| %-13s|\n",
                        mahasiswas[i].getnim(), mahasiswas[i].getnama(), mahasiswas[i].getnilaitugas(),
                        mahasiswas[i].getnilaiuts(), mahasiswas[i].getnilaiuas(), mahasiswas[i].hitungnilaiakhir(),
                        mahasiswas[i].hitungnilaihuruf(), mahasiswas[i].hitungpredikat());
            }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

class Mahasiswa
{
    private String nim;
    private String nama;
    private int nilaitugas;
    private int nilaiuts;
    private int nilaiuas;

    public Mahasiswa(String nim, String nama,
                     int nilaitugas, int nilaiuts, int nilaiuas)
    {
        this.nim = nim;
        this.nama = nama;
        this.nilaitugas = nilaitugas;
        this.nilaiuts = nilaiuts;
        this.nilaiuas = nilaiuas;
    }

    public String getnim()
    {return  nim;}

    public String getnama()
    {return  nama;}

    public int getnilaitugas()
    {return  nilaitugas;}

    public int getnilaiuts()
    {return  nilaiuts;}

    public int getnilaiuas()
    {return  nilaiuas;}

    public double hitungnilaiakhir()
    {
        return (nilaitugas *0.20) + (nilaiuts * 0.35) + (nilaiuas * 0.45);
    }

    public String hitungnilaihuruf()
    {
        double nilai = hitungnilaiakhir();
        if (nilai >= 85 && nilai <= 100)
        {
            return "A";
        } else if (nilai >= 70 && nilai <=84) {
            return "B";
        } else if (nilai >=60 && nilai <=69) {
            return "C";
        } else if (nilai >=40 && nilai <=59) {
            return "D";
        }else {
            return "E";
        }
    }

    public String hitungpredikat()
    {
        String nilaihuruf = hitungnilaihuruf();
        switch (nilaihuruf)
        {
            case "A":
                return "Sangat Baik";
            case "B":
                return "Baik";
            case "C":
                return "Cukup";
            case "D":
                return "Kurang Baik";
            default:
                return "Sangat Kurang Baik";
        }
    }

}

//catatan code ssebelumnya
//System.out.println("Nama : "+mahasiswas[i].getnama());
//System.out.println("Nilai Tugas : "+mahasiswas[i].getnilaitugas());
//System.out.println("Nilai UTS : "+mahasiswas[i].getnilaiuts());
//System.out.println("Nilai UAS : "+mahasiswas[i].getnilaiuas());
//System.out.println("Nilai Akhir : "+mahasiswas[i].hitungnilaiakhir());
//System.out.println("| NIM\t\t\t| Nama\t\t\t| Nilai Tugas\t| Nilai UTS\t| Nilai UAS\t| Nilai Akhir\t| Nilai Huruf\t| Predikat\t|");
//System.out.println("Mahasiswa ke -" + (i+1));