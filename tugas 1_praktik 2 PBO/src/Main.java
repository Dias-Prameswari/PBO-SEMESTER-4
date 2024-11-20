//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Mobil mymobil = new Mobil();

       mymobil.merek1 = "Avanza";
       mymobil.merek2 = "Xenia";
       mymobil.warna = " Silver";

       mymobil.maju = "Maju...";
       mymobil.mundur = "Mundur...";
       mymobil.belok = "Belok...";

       mymobil.rodaAvanza = "4";
       mymobil.rodaXenia = "4";
       mymobil.mesinAvanza = "1";
       mymobil.mesinXenia = "1";
       mymobil.rodaAvanza2 = "5";
       mymobil.rodaXenia2 = "4";
       mymobil.mesinAvanza2 = "9";
       mymobil.mesinXenia2 = "9";
       mymobil.mesinAvanza3 = "9";
       mymobil.mesinXenia3 = "9";

       mymobil.info();
    }
}