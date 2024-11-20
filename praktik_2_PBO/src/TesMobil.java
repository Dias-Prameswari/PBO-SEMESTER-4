public class TesMobil {
public static void main (String []a) {
	Mobil avanza = new Mobil();
	avanza.HidupkanMobil("Xenia");
	avanza.UbahGigi("Avanza Biru");
	avanza.Maju();
	avanza.Mundur();
	avanza.Belok();
	avanza.mesin = 9;
	System.out.println("Roda : "+avanza.roda);
	System.out.println("Mesin : "+avanza.mesin);
	avanza.MatikanMobil("Avanza Hitam");
}
}

class Mobil{
	int roda = 4;
	int body = 1;
	int mesin = 1; //class variable
	void Maju(){
	System.out.println("Maju");
	}
	void Mundur(){
	System.out.println("Mundur");
	}
	void Belok(){
	System.out.println("Belok");
	}
	void HidupkanMobil(String n){
	System.out.println("Hidupkan Mobil : "+n);
	}
	void MatikanMobil(String c){
	System.out.println("Matikan Mobil : "+c);
	}
	void UbahGigi(String b){
	System.out.println("Ubah Gigi Mobil : "+b);
	}
}