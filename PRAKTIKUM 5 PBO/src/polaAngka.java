// coba - coba. agar beda dari dosen tapi caranya hampir sama
import java.util.Scanner;
public class polaAngka {
    public static void main(String[]args)
    {

        int angka = 4;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai bilangan : ");
        int bil = input.nextInt();
        System.out.println("Masukan nilai pecahan : ");
        int pecahan = input.nextInt();
        input.close();

        if (pecahan <= bil)
        {
            System.out.println("Bilangan : "+bil);
            int counter = 0;
            for (int i = 1; i <= bil; i++)
            {
                System.out.print(i + " ");
                counter++;
                if (counter == angka)
                {
                    System.out.println();
                    counter = 0;
                }
            }
            System.out.println("-------------------------------");
            System.out.println("Dipecah : "+pecahan);
            for (int i = 1; i <=bil ; i++)
            {
                System.out.print(i + " ");
                if (i % pecahan == 0)
                {
                    System.out.println();

                }
            }
        }
        else {
            System.out.print("Nilai pecahan tidak boleh melebihi nilai bilangan");
        }
    }
}
