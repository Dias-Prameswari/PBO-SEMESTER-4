//double array
//cara dosen. mempraktikan saja bukan tugas
public class matriks {
    public static void main(String[]args)
    {
        int array [][] = {{1,3,5}, {2,4,6}};
        System.out.println("Row Size : " + array.length);
        System.out.println("Column Size : "+ array[1].length);
        outputArray(array);
    }
    public static void outputArray(int[][]array)
    {
        int rowsize = array.length;
        int columnsize = array[0].length;
        for (int i = 0; i <= 1; i++)
        {
            System.out.print("[");
            for (int j = 0; j <=2; j++)
            {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("]");
        }
        System.out.println();
    }
}
