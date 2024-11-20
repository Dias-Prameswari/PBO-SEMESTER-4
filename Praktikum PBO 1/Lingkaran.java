import java.util.Scanner;
//java.util.scanner : bagian dari pustaka standar java
// untuk membaca masukan / input / angka yang kita inginkan

public class Lingkaran{
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	// scanner membaca input dari input standar/ sytem.in
	
	System.out.println("Masukkan jari - jari : ");
	// memasukkan angka yang diinginkan
	
	int r = scanner.nextInt();
	// r=jari - jari 
	// membaca dan menyimpannya ke dalam variabel jari - jari untuk 
	// dihitung sesuai rumus
	
	double luas = Math.PI * (r*r);
	double keliling = 2 * Math.PI * r; 
	// Math.PI = 3.14/phi 

	System.out.println("Luas : "+luas);
	System.out.println("Keliling : "+keliling);

}
}