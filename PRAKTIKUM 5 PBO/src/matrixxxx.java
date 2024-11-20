import java.util.Scanner;
public class matrixxxx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Penjumlahan ");
            System.out.println("2. Transposisi ");
            System.out.println("3. Perkalian ");
            System.out.println("4. Keluar ");
            System.out.println("Pilih menu : ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    jumlahan(scanner);//penjumlahan
                    break;

                case 2:
                    trans(scanner);//transposisi
                    break;

                case 3:
                    kali(scanner);//perkalian
                    break;

                case 4:
                    System.out.println("Terima kasih");
                    return;//klo pilih keluar
                default:
                    System.out.println("Pilihan menu tidak ada");
            }
        }
    }//kurung main

    //method input data matriks
    public static int[][] inputdata(int rows, int cols, Scanner scanner) {
        int[][] matrikss = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Input matriks [" + i + "," + j + "]= ");
                matrikss[i][j] = scanner.nextInt();
            }
        }
        return matrikss;
    }

    //method hasil matriks
    public static void resultmatriks(int[][] mattriks) {
        for (int[] row : mattriks) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //perhitungan penjumlahan
    public static void jumlahan(Scanner scanner) {
        System.out.print("Input baris matriks A: ");
        int barisA = scanner.nextInt();
        System.out.print("Input kolom matriks A: ");
        int kolomA = scanner.nextInt();
        int[][] matriksA = inputdata(barisA, kolomA, scanner);

        System.out.print("Input baris matriks B: ");
        int barisB = scanner.nextInt();
        System.out.print("Input kolom matriks B: ");
        int kolomB = scanner.nextInt();
        int[][] matriksB = inputdata(barisB, kolomB, scanner);

        if (barisA != barisB || kolomA != kolomB) {
            System.out.println("Matriks tidak dapat dijumlahkan. Karena ukurannya tidak sama.");
        } else {
            int[][] sum = addmatriks(matriksA, matriksB);
            System.out.println("Hasil penjumlah matriks A + matriks B : ");
            resultmatriks(sum);
        }
    }

    public static int[][] addmatriks(int[][] matriksA, int[][] matriksB) {
        int rows = matriksA.length;
        int cols = matriksB.length;
        int[][] hasil = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        return hasil;
    }

    //method transposisi
    public static void trans(Scanner scanner) {
        System.out.print("Input baris matriks C: ");
        int barisC = scanner.nextInt();
        System.out.print("Input kolom matriks C: ");
        int kolomC = scanner.nextInt();
        int[][] matriksC = inputdata(barisC, kolomC, scanner);

        int[][] transpoA = addtrans(matriksC);
        System.out.println("Hasil transposisi matriks C : ");
        resultmatriks(transpoA);
    }

    public static int[][] addtrans(int[][] matriksC) {
        int rows = matriksC.length;
        int cols = matriksC[0].length;
        int[][] hasil2 = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                hasil2[i][j] = matriksC[i][j];//ditukar
            }
        }
        return hasil2;
    }

    //method perkalian
    public static void kali(Scanner scanner) {
        System.out.print("Input baris matriks A: ");
        int barisD = scanner.nextInt();
        System.out.print("Input kolom matriks A: ");
        int kolomD = scanner.nextInt();
        int[][] matriksD = inputdata(barisD, kolomD, scanner);

        System.out.print("Input baris matriks B: ");
        int barisE = scanner.nextInt();
        System.out.print("Input kolom matriks B: ");
        int kolomE = scanner.nextInt();
        int[][] matriksE = inputdata(barisE, kolomE, scanner);

        if (kolomD != barisE) {
            System.out.println("Perkalian matriks tidak dapat terjadi, karena jumlah kolom matriks A " +
                    "tidak sama dengan jumlah baris matriks B");
        } else {
            int[][] kalic = addkali(matriksD, matriksE);
            System.out.println("Hasil perkalian matriks A x matriks B : ");
            resultmatriks(kalic);
        }
    }

    public static int[][] addkali(int[][] matriksD, int[][] matriksE) {
        int rowA = matriksD.length;
        int colsA = matriksD[0].length;
        int colB = matriksE[0].length;
        int[][] hasil3 = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colsA; k++) {
                    hasil3[i][j] += matriksD[i][k] * matriksE[k][j];
                }
            }
        }
        return hasil3;
    }

}//kurung class