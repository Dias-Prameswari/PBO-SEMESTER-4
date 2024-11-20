//latihan 3. praktik 5 pbo

import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan inputan : ");
        String input = scanner.nextLine();

        //memisahkan string input menjadi array string menggunakan spasi sebagai pemisah
        String[] numbersStr = input.split(" ");

        //membuat array integer/int untuk menyimpan angka dari string input
        int[] numbers = new int[numbersStr.length];

        //loop melalui array string input
        for (int i = 0; i < numbersStr.length; i++) {
            //mengonversi setiap string menjadi int/integer dan menyimpannya di array numbers itu
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        //kata - kata insertion sort harus beda dengan nama filenya
        // metode ini untuk memanggil array sebagai argumen
        insertionSort(numbers);
    }
    //mendefinisikan metode insertion sort yang menerima
    //array integer sebagai parameter
    static void insertionSort(int[] arr)
    {
        //n untuk panjang array
        int n = arr.length;

        //loop melalui array dimulai dari indeks 2(indeks 1)
        for (int i = 1; i<n; ++i)//
        {
            //menyimpan nilai elemen saat ini ke dalam variabel key
            int key = arr[i];

            //mendeklarasikan variabel j untuk mengakses elemen sebelumnya
            int j = i - 1;

            //memeriksa elemen sebelumnya & memeriksa apakah harus dilakukan
            //penempatan yang benar untuk elemen saat ini
            while (j >= 0 && arr[j] > key)
            {
                //memindahkan elemen yang lebih besar maju 1 didepan
                arr[j + 1] = arr[j];

                //memindahkan ke elemen sebelumnya
                j = j -1 ;
            }
            //menempatkan elemen saat ini ke posisi yang benar dalam sub array yang diurutkan
            arr[j + 1] = key;

            //memanggil untuk mencetak array setelah perubahan
            printArray(arr);
        }
    }

    //mendefinisikan metode printarray untuk mencetak isi array
    static void printArray(int[] arr)
    {
        //loop melalui array
        for (int num : arr)
        {
            //mencetak setiap elemen
            System.out.print(num + " ");
        }
        //mencetak baris baru setelah mencetak seluruh array
        System.out.println();
    }
}
