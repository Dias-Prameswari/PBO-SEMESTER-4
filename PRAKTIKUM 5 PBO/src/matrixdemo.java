import java.util.ArrayList;
import java.util.Scanner;
public class matrixdemo {
    public static void main(String[]args)
    {
        ArrayList<Integer> matriksA = new ArrayList<Integer>();
        ArrayList<Integer> matriksB = new ArrayList<Integer>();
        ArrayList<Integer> tambah = new ArrayList<Integer>();
        ArrayList<Integer> kurang = new ArrayList<Integer>();
        ArrayList<Integer> kali = new ArrayList<Integer>();
        ArrayList<Double> bagi = new ArrayList<Double>();

        Scanner scanner = new Scanner(System.in);
        //memasukkan jumlah data
        System.out.println("Masukan jumlah data matriks : ");
        int jumlah = scanner.nextInt();

        //memasukkan data matriks A
        System.out.println("Masukan nilai matriks A : ");
        for (int i = 0; i<jumlah; i++)
        {
            System.out.println("Masukkan nilai ke- "+ (i + 1) +": ");
            int nilai = scanner.nextInt();
            matriksA.add(nilai);
        }
        //memasukkan data matriks B
        System.out.println("Masukan nilai matriks B : ");
        for (int i = 0; i<jumlah; i++)
        {
            System.out.println("Masukkan nilai ke- "+ (i + 1) +": ");
            int nilai = scanner.nextInt();
            matriksB.add(nilai);
        }

        //penjumlahan :
        for (int i =0; i<jumlah; i++)
        {
            tambah.add(matriksA.get(i) + matriksB.get(i));
        }
        //pengurangan:
        for (int i =0; i<jumlah; i++)
        {
            kurang.add(matriksA.get(i) - matriksB.get(i));
        }
        //perkalian :
        for (int i =0; i<jumlah; i++)
        {
            kali.add(matriksA.get(i) * matriksB.get(i));
        }
        //pembagian :
        for (int i =0; i<jumlah; i++)
        {
            bagi.add((double)matriksA.get(i) + matriksB.get(i));
        }

        //method cetak :
        System.out.println("Hasil penjumlahan matriks A + matriks B : "+tambah);
        System.out.println("Hasil pengurangan matriks A - matriks B : "+kurang);
        System.out.println("Hasil perkalian matriks A x matriks B : "+kali);
        System.out.println("Hasil pembagian matriks A : matriks B : "+bagi);

        scanner.close();
    }
}
