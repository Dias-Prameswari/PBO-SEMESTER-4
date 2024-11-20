public class TesMobil{
		//file ini terhubung dengan file Mobil. dan harus di run melalui file Mobil

public static void main(String[] a){
	Mobil avanza=new Mobil();// bgian avanza=new tdk boleh di spasi
	avanza.maju();
	avanza.mundur();
	avanza.belok();
	System.out.println("Roda : "+avanza.roda);
	System.out.println("Mesin : "+avanza.mesin);
}
}