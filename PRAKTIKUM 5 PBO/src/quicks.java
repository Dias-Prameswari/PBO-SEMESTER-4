public class quicks {
    private static int partition(int[] A, int p, int r) {
        int pivot, i, j;
        pivot = A[p];
        i = p - 1;
        j = r + 1;
        for (;;) {

            do {
                i++;
            } while (A[i] < pivot);
            do {
                j--;
            } while (A[j] > pivot);

            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            } else {
                return j;
            }
        }
    }
    public static void quickSort(int[] A, int p, int r) {
        int q;
        if (p < r) {
            q = partition(A,p,r);
            quickSort(A,p, q);
            quickSort(A,q + 1, r);
        }
    }
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
}

