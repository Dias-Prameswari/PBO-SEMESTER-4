//latihan 4 praktik 5 pbo
//pake cara dosen + cara lain
//masih ragu sama hasil perhitungan matriks perkalian & pembagian
//tidak menampilkan hasil transfor matriks c

import java.util.ArrayList;
import java.util.Scanner;

public class matrix {
    public static void main(String[]args)
    {
        //menu pilihan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Pilihan Matriks : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Pilih operasi (1/2/3/4)");
        int menupilihan = scanner.nextInt();

        ArrayList<Integer> matriksA = new ArrayList<Integer>();
        ArrayList<Integer> matriksB = new ArrayList<Integer>();
        ArrayList<Integer> jumlah1 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah3 = new ArrayList<Integer>();
        ArrayList<Double> jumlah4 = new ArrayList<Double>();

        //matriks A
        System.out.println("Matriks A : ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            matriksA.add(nilai);
        }

        //matriks B
        System.out.println("Matriks B : ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            matriksB.add(nilai);
        }

        switch (menupilihan)
        {
            case 1:
                //penjumlahan
                for (int i=0; i<4; i++)
                {
                    jumlah1.add(matriksA.get(i) + matriksB.get(i));
                }
                System.out.println("Hasil penjumlahan matriks A + matriks B :  ");
                for (int i=0; i<4; i++)
                {
                    System.out.println("Jumlah index ke "+i+ " = "+jumlah1.get(i));
                }
            break;

            case 2:
                //pengurangan
                for (int i=0; i<4; i++)
                {
                    jumlah2.add(matriksA.get(i) - matriksB.get(i));
                }
                System.out.println("Hasil pengurangan matriks A - matriks B :  ");
                for (int i=0; i<4; i++)
                {
                    System.out.println("Jumlah index ke "+i+ " = "+jumlah2.get(i));
                }
            break;

            case 3:
                //perkalian
                for (int i=0; i<4; i++)
                {
                    jumlah3.add(matriksA.get(i) * matriksB.get(i));
                }
                System.out.println("Hasil perkalian matriks A x matriks B :  ");
                for (int i=0; i<4; i++)
                {
                    System.out.println("Jumlah index ke "+i+ " = "+jumlah3.get(i));
                }
            break;

            case 4 :
                //pembagian
                for (int i=0; i<4; i++)
                {
                    jumlah4.add((double)matriksA.get(i) / matriksB.get(i));
                }
                System.out.println("Hasil perkalian matriks A : matriks B :  ");
                for (int i=0; i<4; i++)
                {
                    System.out.println("Jumlah index ke "+i+ " = "+jumlah4.get(i));
                }
            break;
        }

        System.out.print("Input data lagi [Y/T]? ");
        String inputLagi = scanner.next();
        if (inputLagi.equalsIgnoreCase("Y")) {
            main(args);
        } else {
            System.out.println("Terima kasih!");
        }

    }
}
