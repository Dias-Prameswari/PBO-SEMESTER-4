//latihan 1 bagian array tetapi beda metode
//coba - coba
//jumlah data dimasukkan sesuai kita. jika memasukkan 20, maka kita juga akan memasukkan
//data sebanyak 20/19 kali. lalu angka - angka tdi akan di masukkan sesuai data ke brp dan hasil ke brp
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist2 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();

        System.out.println("Masukkan Jumlah Data : ");
        int jumlahdata = input.nextInt();

        for (int i = 0; i<jumlahdata; i++)
        {
            System.out.println("Masukkan data ke -"+ (i+1) + " = ");
            int data = input.nextInt();
            x.add(data);
        }
        input.close();

        System.out.println("Jumlah Data : "+x.size());
        for (int i = 0; i<x.size(); i++)
        {
            System.out.println("Data ke -"+ (i+1) + " = "+ x.get(i));
        }
        System.out.println("---------------------------");

        for (int i = 0; i < x.size(); i++)
        {
            System.out.println("Hasil nilai [" + i+ "] ="+ x.get(i));
        }
    }
}
