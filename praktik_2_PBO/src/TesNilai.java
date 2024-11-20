import java.util.Scanner;
class TesNilai{
	String nim, nama, predikat,nHuruf;
	float nilaiUts, nilaiTugas, nilaiUas, pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;
	Scanner input = new Scanner(System.in);
	void inputData(){
		System.out.print("NIM 		: ");nim = input.nextLine();
		System.out.print("Nama 		: ");nama = input.nextLine();
		System.out.print("Nilai Tugas 	: "+nilaiTugas);
		System.out.print("Nilai UTS 	: "+nilaiUts);
		System.out.print("Nilai UAS 	: "+nilaiUas);
	}
	void Nilai(){
		pNilaiTugas = 80 * 20f;
		pNilaiUts = 90 * .35f;
		pNilaiUas = 87 * .45f;
		nilaiAkhir = pNilaiTugas + pNilaiUts + pNilaiUas;
		nilaiTugas=80;
		nilaiUts=90;
		nilaiUas=87;
	}
	void cetakNilai(){
		System.out.println("NIM 		: "+nim);
		System.out.println("Nama 		: "+nama);
		System.out.println("Nilai Tugas     : "+nilaiTugas+"* 20% = "+pNilaiTugas);
		System.out.println("Nilai UTS 	: "+nilaiUts+"* 35% = "+pNilaiUts);
		System.out.println("Nilai UAS 	: "+nilaiUas+"* 35% = "+pNilaiUas);
		System.out.println("Nilai Akhir     : "+nilaiAkhir);
		System.out.println("Nilai Huruf : "+getNilHuruf(nilaiAkhir));
		System.out.println("Predikat   : "+getPredikat(nHuruf));

	}

	String getNilHuruf(float nilai)
	{
		if(nilai>=85)
			nHuruf="A";
		else if (nilai>=80 && nilai<85)
			nHuruf="AB";
		else if(nilai>=70 && nilai<85)
			nHuruf="B";
		else if(nilai>=65 && nilai<70)
			nHuruf="BC";
		else if(nilai>=60 && nilai<70)
			nHuruf="C";
		else if(nilai>=40 && nilai<60)
			nHuruf="D";
		else
			nHuruf="E";
		return nHuruf;
	}
	String getPredikat(String huruf){
		switch(huruf)
		{
			case "A":predikat="Apik";
				break;
			case "B":predikat="Baik";
				break;
			case "C":predikat="Cukup";
				break;
			case "D":predikat="Dablek";
				break;
			default:predikat="Elek";
		}
		return predikat;
	}


}