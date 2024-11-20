//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //untuk memasukkan NIM yang diinginkan
       Scanner input = new Scanner(System.in); //diketik 1x tp bisa buat ngisi bbrp deklarasi
       System.out.println("Masukkan NIM : ");
       String nim = input.nextLine();

       //untuk memasukkan NAMA yang diinginkan
        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();

        //deklarasi variabel
        int nilai_tugas, nilai_UTS, nilai_UAS;
        double pNilai_tugas, pNilai_UTS, pNilai_UAS,pNilaiAkhir;

        //untuk memasukkan NILAI TUGAS yang diinginkan
        System.out.println("Masukkan Nilai Tugas : ");
        nilai_tugas = input.nextInt();

        //untuk memasukkan NILAI UTS yang diinginkan
        System.out.println("Masukkan Nilai UTS : ");
        nilai_UTS = input.nextInt();

        //untuk memasukkan NILAI UAS yang diinginkan
        System.out.println("Masukkan Nilai UAS : ");
        nilai_UAS = input.nextInt();

        //deklarasai variabel untuk menghitung nilai
        pNilai_tugas = nilai_tugas * 0.20;
        pNilai_UTS = nilai_UTS * 0.35;
        pNilai_UAS = nilai_UAS * 0.45;
        pNilaiAkhir = pNilai_tugas + pNilai_UTS + pNilai_UAS;

     //menampilkan semua hasil output
        System.out.println("\n");//spasi/jarak
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Nilai Tugas : "+(int)pNilai_tugas);
        System.out.println("Nilai UTS : "+(int)pNilai_UTS);
        System.out.println("Nilai UAS : "+(int)pNilai_UAS);
        System.out.println("Nilai Akhir : "+(int)pNilaiAkhir);


    }
}