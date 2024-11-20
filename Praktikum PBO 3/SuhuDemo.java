public class SuhuDemo{
public static void main(String[] args)
{
	Suhu suhuku = new Suhu();
	suhuku.cToK(23);
	System.out.println("suhunya : "+suhuku.cToK(23.5f)+" K");//ga ush dicoba, karna hasilnya sama
	Suhu suhumu = new Suhu(23);//
	suhumu.cToK(suhumu.c);
	suhumu.cToR(suhumu.c);
	suhumu.cToF(suhumu.c);
	suhumu.cToD(suhumu.c);
	suhumu.cToN(suhumu.c);
	suhumu.cToReamur(suhumu.c);
	suhumu.cToRomer(suhumu.c);
	
}
}