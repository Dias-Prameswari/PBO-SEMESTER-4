import java.util.Scanner;
public class Suhu{
	int c;
	float hsl;
	public Suhu(){};
	public Suhu(int c)
	{
		this.c=c;
	}
	void cToK(int c)
	{
		hsl= c + 273.15f;//kelvin
		System.out.println(c+"C : "+hsl+" K");
	}
	float cToK(float c)
	{
		return c + 273.15f;//kelvin
	}
	
	void cToR(int c)
	{
		hsl = c * 1.8f + 491.67f;//rankine
		System.out.println(c+"C : "+hsl+" R");
	}
	float cToR(float c)
	{
		return c * 1.8f + 491.67f;//rankine
	}
	
	void cToF(int c)
	{
		hsl = c * 1.8f + 32f;//fahrenheit
		System.out.println(c+"C : "+hsl+" F");
	}
	float cToF(float c)
	{
		return c * 1.8f + 32f;//fahrenheit
	}
	
	void cToD(int c)
	{
		hsl = (100-c) * 1.5f ;//delisle
		System.out.println(c+"C : "+hsl+" D");
	}
	float cToD(float c)
	{
		return (100-c) * 1.5f;//delisle
	}

	void cToN(int c)
	{
		hsl = c * 33/100;//newton
		System.out.println(c+"C : "+hsl+" N");
	}
	float cToN(float c)
	{
		return c * 33/100;//newton
	}

	void cToReamur(int c)
	{
		hsl = c * 0.8f;//reaumur
		System.out.println(c+"C : "+hsl+" Reaumur");
	}
	float cToReamur(float c)
	{
		return c * 0.8f;//reaumur
	}

	void cToRomer(int c)
	{
		hsl = c * 21/40 +7.5f;//romer
		System.out.println(c+"C : "+hsl+" Romer");
	}
	float cToRomer(float c)
	{
		return c * 21/40 + 7.5f;//romer
	}





}