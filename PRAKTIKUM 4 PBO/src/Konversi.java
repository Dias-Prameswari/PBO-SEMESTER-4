//praktik 4 soal no 3 :
import java.util.Scanner;
public class Konversi {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        char jawaban = 'Y';
        while (jawaban == 'Y' || jawaban == 'y')
        {
            System.out.println("Masukkan jumlah detik : ");
            int detik = input.nextInt();

            int hari = detik / 86400;
            detik %= 86400;

            int jam = detik / 3600;
            detik %= 3600;

            int menit = detik / 60;
            detik %= 60;

            System.out.println("Hasil konversi waktu : ");
            System.out.println("Hari : " + hari);
            System.out.println("Jam : " + jam);
            System.out.println("Menit : " + menit);
            System.out.println("Detik : " + detik);

            System.out.println("Input data lagi [Y/T] ?");
            jawaban = input.next().charAt(0);
        }
        input.close();
    }
}
