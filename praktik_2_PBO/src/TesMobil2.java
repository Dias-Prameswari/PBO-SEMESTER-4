public class TesMobil2{
public static void main(String[] a){
	Mobil2 avanza=new Mobil2();
	Mobil2 xenia=new Mobil2();
	avanza.hidupkanMobil("Avanza Silver");
	avanza.ubahGigi("Avanza Silver");
	avanza.maju();
	avanza.mundur();
	avanza.belok();
	System.out.println("Roda Avanza : "+avanza.roda);
	System.out.println("Roda Xenia : "+xenia.roda);
	System.out.println("Mesin Avanza : "+avanza.mesin);
	System.out.println("Mesin Xenia : "+xenia.mesin);
	avanza.roda=5;
	System.out.println("Roda Avanza : "+avanza.roda);
	System.out.println("Roda Xenia : "+xenia.roda);
	avanza.mesin=9;
	System.out.println("Mesin Avanza : "+avanza.mesin);
	System.out.println("Mesin Xenia : "+xenia.mesin);
	avanza.matikanMobil("Avanza Silver");
}
}