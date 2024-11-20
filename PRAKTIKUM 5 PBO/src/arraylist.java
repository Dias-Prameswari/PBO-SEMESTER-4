//latihan 1 bagian array. praktik 5
//pake cara dosen yg singel array
public class arraylist {
    public static void main(String[]args)
    {
        int [] x = new int[5];
        x[0] = 68;
        x[1] = 7;
        x[2] = 28;
        x[3] = 90;
        x[4] = 32;

        System.out.println("Jumlah data : "+x.length);
        for (int i = 0; i <x.length; i++)
        {
            System.out.println("Data ke - "+(i+1)+ " = " + x[i]);
        }
        System.out.println("--------------------------");
        for (int i = 0; i< x.length;i++)
        {
            System.out.println("Hasil nilai [" + i+ "] = "+x[i]);
        }
    }
}
