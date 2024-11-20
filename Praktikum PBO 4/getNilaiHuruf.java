char getNilaiHuruf(float nilai)
{
	if(nilai>=85)
		nHuruf='A';
	else if(nilai>=70 && nilai<85)
		nHuruf='B';
	else if(nilai>=60  && nilai<70)
		nHuruf='C';
	else if(nilai>=40 && nilai<60)
		nHuruf='D';
	else
		nHuruf='E';
	return nHuruf;
	
}
String getPredikat(char huruf)
{
	switch(huruf)
	{
		case 'A':predikat="Apik";
		break;
		case 'B':predikat="Baik";
		break;
		case 'C':predikat="Cukup";
		break;
		case 'D':predikat="Dablek";
		break;
		default:predikat="Elek";
	}
	return predikat;
}
System.out.println("Nilai Huruf : "+getNilaiHuruf(nilaiAkhir));
System.out.println("Predikat : "+getPredikat(nHuruf));
