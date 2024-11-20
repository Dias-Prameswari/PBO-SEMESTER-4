public class Matematika{
	int a,b;
	float hasil;
	void pertambahan()
	{
		hasil=a+b;
		System.out.println("Pertambahan : " +a+" + "+b+" = "+hasil);
	}
	void pengurangan()
	{
		hasil=a-b;
		System.out.println("Pengurangan : " +a+" - "+b+" = "+hasil);
	}
	void perkalian()
	{
		hasil=a*b;
		System.out.println("Perkalian : " +a+" * "+b+" = "+hasil);
	}
	void pembagian()
	{
		hasil=a/b;
		System.out.println("Pembagian : " +a+" : "+b+" = "+hasil);
	}
//
	void pertambahan(float a, float b)//metode ini tidak akan bisa dirun, karena yang dirun hanyalah code di bagian double
	{
		hasil=a+b;
		System.out.println("Pertambahan : " +a+" + "+b+" = "+hasil);
	}
	
	double pertambahan(double a,double b, double c)
	{
		return a+b+c;
	}
	
	void pengurangan(float a, float b)
	{
		hasil=a-b;
		System.out.println("Pengurangan : " +a+" - "+b+" = "+hasil);
	}
	
	double pengurangan(double a,double b, double c)
	{
		return a-b-c;
	}
	
	void perkalian(float a, float b)
	{
		hasil=a*b;
		System.out.println("Perkalian : " +a+" * "+b+" = "+hasil);
	}
	
	double perkalian(double a,double b, double c)
	{
		return a*b*c;
	}
	
	void pembagian(float a, float b)
	{
		hasil=a/b;
		System.out.println("Pertambahan : " +a+" : "+b+" = "+hasil);
	}
	
	double pembagian(double a,double b, double c)
	{
		return a/b/c;
	}
	
	

}