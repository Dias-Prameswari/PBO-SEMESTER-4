//latihan 4 praktik 5 pbo
//pake cara cht gpt
//tapi masih salah dibagian perkalian & pembagian

import java.util.ArrayList;
import java.util.Scanner;
public class latihan4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Menu Pilihan:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Pilih operasi (1/2/3/4): ");
            int menu = scanner.nextInt();

            System.out.print("Input baris matriks A: ");
            int barisA = scanner.nextInt();
            System.out.print("Input kolom matriks A: ");
            int kolomA = scanner.nextInt();

            System.out.print("Input baris matriks B: ");
            int barisB = scanner.nextInt();
            System.out.print("Input kolom matriks B: ");
            int kolomB = scanner.nextInt();

            ArrayList<ArrayList<Integer>> matriksA = inputDataMatriks(scanner, barisA, kolomA, "A");
            ArrayList<ArrayList<Integer>> matriksB = inputDataMatriks(scanner, barisB, kolomB, "B");

            ArrayList<ArrayList<Integer>> hasil = new ArrayList<>();
            ArrayList<ArrayList<Integer>> hasil2 = new ArrayList<>();//untuk metode perkalian & pembagian tetapi masih error

            switch (menu) {
                case 1:
                        hasil = penjumlahanMatriks(matriksA, matriksB);
                        System.out.println("Hasil penjumlahan Matriks A + B = "+hasil);

                    break;
                case 2:
                        hasil = penguranganMatriks(matriksA, matriksB);
                        System.out.println("Hasil pengurangan Matriks A - B = "+hasil);
                    break;
                case 3:
                        hasil = perkalianMatriks(matriksA, matriksB);//gnti hasil2 tetapi masih error
                        System.out.println("Hasil perkalian Matriks A x B = "+hasil2);//salah
                    break;
                case 4:
                        hasil = pembagianMatriks(matriksA, matriksB);
                        System.out.println("Hasil pembagian Matriks A : B = "+hasil);//salah
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }

            if (!hasil.isEmpty()) {
                tampilkanMatriks(hasil);
            }

            System.out.print("Input data lagi [Y/T]? ");
            String inputLagi = scanner.next();
            if (inputLagi.equalsIgnoreCase("Y")) {
                main(args);
            } else {
                System.out.println("Terima kasih!");
            }
        }

        public static ArrayList<ArrayList<Integer>> inputDataMatriks(Scanner scanner, int baris, int kolom, String namaMatriks) {
            ArrayList<ArrayList<Integer>> matriks = new ArrayList<>();
            System.out.println("Input data untuk matriks " + namaMatriks + ": ");
            for (int i = 0; i < baris; i++) {
                ArrayList<Integer> barisMatriks = new ArrayList<>();
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Masukkan elemen baris ke-" + (i + 1) + ", kolom ke-" + (j + 1) + ": ");
                    int elemen = scanner.nextInt();
                    barisMatriks.add(elemen);
                }
                matriks.add(barisMatriks);
            }
            return matriks;
        }

        public static ArrayList<ArrayList<Integer>> penjumlahanMatriks(ArrayList<ArrayList<Integer>> matriksA, ArrayList<ArrayList<Integer>> matriksB)
        {
            ArrayList<ArrayList<Integer>> hasil = new ArrayList<>();
            for (int i = 0; i < matriksA.size(); i++) {
                ArrayList<Integer> barisHasil = new ArrayList<>();
                for (int j = 0; j < matriksA.get(i).size(); j++) {
                    int elemenA = matriksA.get(i).get(j);
                    int elemenB = matriksB.get(i).get(j);
                    int hasilElemen = elemenA + elemenB;
                    barisHasil.add(hasilElemen);
                }
                hasil.add(barisHasil);
            }
            return hasil;
        }

        public static ArrayList<ArrayList<Integer>> penguranganMatriks(ArrayList<ArrayList<Integer>> matriksA, ArrayList<ArrayList<Integer>> matriksB)
        {
            ArrayList<ArrayList<Integer>> hasil = new ArrayList<>();
            for (int i = 0; i < matriksA.size(); i++) {
                ArrayList<Integer> barisHasil = new ArrayList<>();
                for (int j = 0; j < matriksA.get(i).size(); j++) {
                    int elemenA = matriksA.get(i).get(j);
                    int elemenB = matriksB.get(i).get(j);
                    int hasilElemen = elemenA - elemenB;
                    barisHasil.add(hasilElemen);
                }
                hasil.add(barisHasil);
            }
            return hasil;
        }

    public static ArrayList<ArrayList<Integer>> perkalianMatriks(ArrayList<ArrayList<Integer>> matriksA, ArrayList<ArrayList<Integer>> matriksB)
    {
        ArrayList<ArrayList<Integer>> hasil2 = new ArrayList<>();
        for (int i = 0; i < matriksA.size(); i++) {
            ArrayList<Integer> barisHasil = new ArrayList<>();
            for (int j = 0; j < matriksA.get(i).size(); j++) {
                int elemenA = matriksA.get(i).get(j);
                int elemenB = matriksB.get(i).get(j);
                int hasilElemen = elemenA * elemenB;
                barisHasil.add(hasilElemen);
            }
            hasil2.add(barisHasil);
        }
        return hasil2;
    }

    public static ArrayList<ArrayList<Integer>> pembagianMatriks(ArrayList<ArrayList<Integer>> matriksA, ArrayList<ArrayList<Integer>> matriksB)
    {
        ArrayList<ArrayList<Integer>> hasil = new ArrayList<>();
        for (int i = 0; i < matriksA.size(); i++) {
            ArrayList<Integer> barisHasil = new ArrayList<>();
            for (int j = 0; j < matriksA.get(i).size(); j++) {
                int elemenA = matriksA.get(i).get(j);
                int elemenB = matriksB.get(i).get(j);
                int hasilElemen = elemenA / elemenB;
                barisHasil.add(hasilElemen);
            }
            hasil.add(barisHasil);
        }
        return hasil;
    }

        public static void tampilkanMatriks(ArrayList<ArrayList<Integer>> matriks) {
            System.out.println("Hasil transformasi matriks C:");
            for (ArrayList<Integer> baris : matriks) {
                for (int elemen : baris) {
                    System.out.print(elemen + " ");
                }
                System.out.println();
            }
        }


}
