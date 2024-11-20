public class mergesort {
    // Method untuk memisahkan array menjadi dua bagian
    private void merge(int[] arr, int left, int mid, int right) {
        // Hitung panjang array untuk dua bagian
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Buat array temporari untuk dua bagian
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Salin data ke array temporari L[] dan R[]
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Gabungkan array temporari kembali ke arr[left..right]
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Salin sisa elemen di L[] jika ada
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Salin sisa elemen di R[] jika ada
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        printArray(arr);
    }

    // Method utama untuk melakukan merge sort
    private void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Temukan titik tengah
            int mid = (left + right) / 2;

            // Panggil sort() untuk bagian kiri array
            sort(arr, left, mid);

            // Panggil sort() untuk bagian kanan array
            sort(arr, mid + 1, right);

            // Gabungkan dua bagian yang sudah diurutkan
            merge(arr, left, mid, right);

        }
    }

    // Method untuk mencetak array
    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Method utama untuk memanggil fungsi merge sort
    public static void main(String[] args) {
        int[] arr = { 7, 1, 3, 5, 2 };
        System.out.println("Array sebelum diurutkan:");
        mergesort ms = new mergesort();
        ms.printArray(arr);
        ms.sort(arr, 0, arr.length - 1);
        System.out.println("Array setelah diurutkan:");
        ms.printArray(arr);
    }
}
