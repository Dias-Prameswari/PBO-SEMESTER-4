import java.util.Scanner;

abstract class Hewan{
    abstract void jenis();
    abstract void ciri();
    abstract void suara();
    abstract void bergerak();
    abstract void bernafas();
    abstract void habitat_hidup();
}

class Singa extends Hewan{
    @Override
    void jenis(){
        System.out.println("Jenis : Singa termasuk ke dalam hewan mamalia");
    }
    @Override
    void ciri(){
        System.out.println("Ciri : Singa memiliki bulu tebal, ekor berbulu dan cakar yang kuat. " +
                "Jantan memiliki jambul di sekitar leher.");
    }
    @Override
    void suara(){
        System.out.println("Suara singa : rawrr");
    }
    @Override
    void bergerak(){
        System.out.println("Bergerak : Cara singa bergerak adalah menggunakan ke - 4 kakinya" +
                "yang bersentuhan dengan tanah.");
    }
    @Override
    void bernafas(){
        System.out.println("Bernafas : Cara singa bernafas adalah menggunakan paru - paru.");
    }
    @Override
    void habitat_hidup(){
        System.out.println("Habitat Hidup : Singa hidup di padang rumput, Savana dan" +
                "hutan terbuka di Afrika dan beberapa bagian di Asia.");
    }
}

class  Elang extends Hewan{
    @Override
    void jenis(){
        System.out.println("Jenis : Elang termasuk ke dalam hewan mamalia laut.");
    }
    @Override
    void ciri() {
        System.out.println("Ciri : Elang memiliki paruh tajam, mata yang tajam dan sayap yang kuat.");
    }

    @Override
    void suara() {
        System.out.println("Suara elang : kiiiik");
    }

    @Override
    void bergerak() {
        System.out.println("Bergerak : Cara elang bergerak adalah menggunakan sayap dan terbang di udara.");
    }

    @Override
    void bernafas() {
        System.out.println("Bernafas : Cara elang bernafas adalah menggunakan paru - paru");
    }

    @Override
    void habitat_hidup() {
        System.out.println("Habitat hidup : Elang dapat ditemukan di berbagai habitat, termasuk pegunungan, hutan dan " +
                "daerah terbuka");
    }
}

class Lebah extends Hewan{
    @Override
    void jenis() {
        System.out.println("Jenis : Lebah termasuk ke dalam hewan serangga yang hidup koloni.");
    }

    @Override
    void ciri() {
        System.out.println("Ciri : Lebah memiliki tubuh berbulu, dua pasang sayap dan mulut" +
                "yang mengandung probosis untuk mengumpulkan nektar.");
    }

    @Override
    void suara() {
        System.out.println("Suara lebah : bzzzzt");
    }

    @Override
    void bergerak() {
        System.out.println("Bergerak : Cara lebah bergerak adalah menggunakan sayap.");
    }

    @Override
    void bernafas() {
        System.out.println("Bernafas : Cara lebah bernafas adalah melalui trakea, yaitu sistem tabung" +
                "udara yang menghubungkan langsung ke sel - sel tubuh.");
    }

    @Override
    void habitat_hidup() {
        System.out.println("Habitat hidup : Lebah hidup di sarang yang terbuat dari lilin yang mereka hasilkan.");
    }
}

class Paus extends Hewan{
    @Override
    void jenis() {
        System.out.println("Jenis : Paus termasuk ke dalam hewan mamalia laut.");
    }

    @Override
    void ciri() {
        System.out.println("Ciri : Paus memiliki tubuh besar, sirip dan ekor. Beberapa paus memiliki gigi," +
                "sementara yang lain memiliki balin untuk menyaring plankton.");
    }

    @Override
    void suara() {
        System.out.println("Suara : Paus memiliki berbagai suara, termasuk nyanyian yang khas. Paus biru" +
                "memiliki suara yang paling keras, mencapai hingga 230dB.");
    }

    @Override
    void bergerak() {
        System.out.println("Bergerak : Cara paus bergerak adalah dengan berenang di lautan dan sirip, ekor yang membantu bergerak.");
    }

    @Override
    void bernafas() {
        System.out.println("Bernafas : Cara paus bernafas adalah melalui lubang sembur atau blowhole yang mengeluarkan udara" +
                "dengan kecepatan tinggi.");
    }

    @Override
    void habitat_hidup() {
        System.out.println("Habitat hidup : Paus hidup di lautan di seluruh dunia.");
    }
}


public class overriding {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut){
            System.out.println("Pilih Menu Hewan : ");
            System.out.println("1. Singa");
            System.out.println("2. Elang");
            System.out.println("3. Lebah");
            System.out.println("4. Paus");
            System.out.println("Masukan pilihan (1 - 4) : ");
            int pilihan = scanner.nextInt();

            Hewan hwn = null;
            switch (pilihan){
                case 1 :
                    hwn = new Singa();
                    break;
                case 2 :
                    hwn = new Elang();
                    break;
                case 3 :
                    hwn = new Lebah();
                    break;
                case 4 :
                    hwn = new Paus();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            if (hwn != null){
                hwn.jenis();
                hwn.ciri();
                hwn.suara();
                hwn.bergerak();
                hwn.bernafas();
                hwn.habitat_hidup();
            }

            System.out.println("Apakah Anda ingin melanjutkan? (Y/T) : ");
            char jawab = scanner.next().charAt(0);
            if (jawab == 'T' || jawab == 't'){
                lanjut = false;
                System.out.println("Terima kasih!");
            }
        }
        scanner.close();
    }
}
