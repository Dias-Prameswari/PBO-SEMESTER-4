public class select {
    public static void main(String[]args)
    {
        int arr[] = {7, 1, 3, 5, 2};
        selection(arr);
    }
    public static void selection(int arr[])
    {
        int sel = arr.length;
        System.out.println("Awal Array : ");
        printarr(arr);
        for (int i = 0; i<sel-1; i++)
        {
            int min = i;
            for (int j = i+1; j<sel; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            printarr(arr);
        }
    }

    public static void printarr(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
