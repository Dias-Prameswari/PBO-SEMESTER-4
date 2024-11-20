import java.util.Scanner;
//java.util.scanner : bagian dari pustaka standar java
// untuk membaca masukan / input / angka yang kita inginkan

public class Persegi{
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	// scanner membaca input dari input standar/ sytem.in
	
	System.out.println("Masukkan sisi persegi : ");
	// memasukkan angka yang diinginkan
	
	int sisi = scanner.nextInt();
	// membaca dan menyimpannya ke dalam variabel sisi untuk 
	// dihitung sesuai rumus
	
	int luas = sisi * sisi;
	int keliling = 4 * sisi;
	
	System.out.println("Luas : "+luas);
	System.out.println("Keliling : "+keliling);
}
}