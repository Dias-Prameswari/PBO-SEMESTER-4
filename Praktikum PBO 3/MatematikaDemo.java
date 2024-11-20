public class MatematikaDemo{
	public static void main(String[] args)
	{
	Matematika mtk = new Matematika();
	double hsl;
	mtk.a=20;
	mtk.b=10;
	mtk.pertambahan();
	mtk.pengurangan();
	mtk.perkalian();
	mtk.pembagian();
	
	mtk.pertambahan(20,10f,5);//metode ini tidak akan menghasil hitungan, karena yang dihitung hanyalah bagian double. yaitu 10+20+30 = 60
	hsl=mtk.pertambahan(10,20,30);
	System.out.println("Pertambahan : " +hsl);
	
	mtk.pengurangan(20,10f,5);
	hsl=mtk.pengurangan(10,20,30);
	System.out.println("pengurangan : " +hsl);
	
	mtk.perkalian(20,10f,5);
	hsl=mtk.perkalian(10,20,30);
	System.out.println("Perkalian : " +hsl);
	
	mtk.pembagian(20,10f,5);
	hsl=mtk.pembagian(10,20,30);
	System.out.println("Pembagian : " +hsl);
	
	
	
	
	
	}
}