//latihan 3. praktik 5 pbo
import java.util.Scanner;

public class bubblesort {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan inputan : ");
        String input = scanner.nextLine();
        //memisahkan string input menjadi array string menggunakan spasi sebagai pemisah
        String[] numbersStr = input.split(" ");

        //membuat array integer/int untuk menyimpan angka dari string input
        int[] numbers = new int[numbersStr.length];

        //loop melalui array string input
        for (int i = 0; i < numbersStr.length; i++)
        {
            //mengonversi setiap string menjadi int/integer dan menyimpannya di array numbers itu
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        //kata - kata bubble sort harus beda dengan nama filenya
        // metode ini untuk memanggil array numbers sebagai argumen
        bubbleSort(numbers);
    }

    //mendefinisikan metode yg tadi (bubbleSort) yang menerima array
    // int/integer sebagai parameter
    static void bubbleSort(int[] arr)
    {
        //n = mendapatkan panjang array
        int n = arr.length;

        //untuk menandai apakah ada pertukaran posisi/tidak pada iterasi tertentu
        boolean swapped;

        //loop melalui array
        for (int i = 0; i < n - 1; i++)
        {
            //swapped ke false/salah diawal setiap iterasi
            swapped = false;

            //loop melalui array, membatasi bagian yang belum terurut
            for (int j = 0; j < n - i - 1; j++)
            {
                //memeriksa apakah elemen saat ini lebih besar dari elemen berikutnya
                if (arr[j] > arr[j + 1])
                {
                    //menyimpan nilai sementara dari elemen saat ini
                    int temp = arr[j];

                    //menyalin nilai elemen berikutnya ke elemen saat ini
                    arr[j] = arr[j + 1];

                    //menyalin nilai sementara ke elemen berikutnya
                    arr[j + 1] = temp;

                    //memanggil metode printarray untuk mencetak array setelah pertukaran
                    printArray(arr);

                    //menandai bahwa ada pertukaran yang dilakukan
                    swapped = true;
                }
            }
            //memeriksa apakah ada pertukaran dalam iterasi ini
            //jika tidak, array sudah terurut dan loop dapat dihentikan
            if (!swapped)
            {
                break;
            }
        }
    }

    //mendefinisikan metode printarray untuk mencetak isi array
    static void printArray(int[] arr)
    {
        //loop melalui arrat
        for (int num : arr)
        {
            //mencetak setiap elemen
            System.out.print(num + " ");
        }
        //mencetak baris baru setelah mencetak seluruh array
        System.out.println();
    }
}


