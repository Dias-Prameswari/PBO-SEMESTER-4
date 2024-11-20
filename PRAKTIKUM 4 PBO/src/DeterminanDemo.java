//praktik 4 soal no 2 :
import java.util.Scanner;
public class DeterminanDemo {
    public static void main(String[] args) {
        Determinan determinan = new Determinan();
        Scanner input = new Scanner(System.in);
        char jawaban = 'Y';
        while (jawaban == 'Y' || jawaban == 'y')
        {
            determinan.inputData();
            determinan.hitungD();
            determinan.hitungX();
            determinan.cetak();
            System.out.println("Input data lagi [Y/T] ?");
            jawaban = input.next().charAt(0);
        }
        input.close();
    }
}
