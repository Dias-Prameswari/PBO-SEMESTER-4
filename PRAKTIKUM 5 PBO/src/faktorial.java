//praktik 5 soal no 1 :
import java.util.Scanner;
public class faktorial {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan : ");
        int bilangan = input.nextInt();

        int hasil = 1;
        System.out.println("Hasil Faktorial : "+bilangan);
        for (int i = 1; i <= bilangan; i++)
        //memulai loop dari 1 sampai ke bilangan yang dimasukkan tadi
        {
            hasil *= i;
            //mengalikan nilai hasil dengan nilai i pada setiap iterasi, lalu akan menghitung faktorial
            //dari angkan yang dimasukkan tadi
            if (i < bilangan)
            //memeriksa apakah iterasi saat ini kurang dari bilangan yang dimasukkan tadi
            {
                System.out.println(hasil + " x " + (i + 1) + " = " + (hasil * (i + 1)) );
            //mencetak langkah perhitungan faktorial satu per satu
            }
        }
        input.close();
    }
}
