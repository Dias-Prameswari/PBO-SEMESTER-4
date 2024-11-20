import java.util.Scanner;
//java.util.scanner : bagian dari pustaka standar java
// untuk membaca masukan / input / angka yang kita inginkan

public class Segitiga{
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	// scanner membaca input dari input standar/ sytem.in
	
	System.out.println("Masukkan alas : ");
	// memasukkan angka yang diinginkan
	
	double alas = scanner.nextDouble();
	// membaca dan menyimpannya ke dalam variabel alas untuk 
	// dihitung sesuai rumus
	
	System.out.println("Masukkan tinggi : ");
	double tinggi = scanner.nextDouble();
	System.out.println("Masukkan sisi : ");
	double sisi = scanner.nextDouble();
	
	double luas = 0.5 * alas * tinggi;
	// 0.5 dari 1/2 rumus luas segitiga
	
	double keliling = sisi + sisi + sisi;
	
	System.out.println("Luas : "+luas);
	System.out.println("Keliling : "+keliling);	
}
}