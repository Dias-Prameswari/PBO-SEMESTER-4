import java.io.*;

public class karyawanttp extends karyawanbru {
    double gajipokok;
    int jumlahanak;
    
    void inputtetap() throws IOException
    {
        BufferedReader keyboard = new BufferedReader
        (new InputStreamReader(System.in));
        
        System.out.print("--Karyawan Tetap--");
        System.out.println("Gaji pokok : ");
        gajipokok = Double.parseDouble(keyboard.readLine());
        System.out.println("Jumlah anak : ");
        jumlahanak = Integer.parseInt(keyboard.readLine());
    }
 
    double totalgaji()
    {
        return gajipokok + (jumlahanak * (0.1 *gajipokok));
    }
}