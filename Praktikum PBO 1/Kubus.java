import java.util.Scanner;
//java.util.scanner : bagian dari pustaka standar java
// untuk membaca masukan / input / angka yang kita inginkan

public class Kubus{
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	// scanner membaca input dari input standar/ sytem.in
	
	System.out.println("Masukkan sisi kubus : ");
	// memasukkan angka yang diinginkan
	
	int s = scanner.nextInt();
	// s = sisi
	// membaca dan menyimpannya ke dalam variabel sisi untuk 
	// dihitung sesuai rumus
	
	int luas = 6 * (s*s);
	int keliling = 12 * s;

	System.out.println("Luas : "+luas);
	System.out.println("Keliling : "+keliling);

}
}