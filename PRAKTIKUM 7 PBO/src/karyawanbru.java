import java.io.*;

public class karyawanbru {
    String nip;
    String nama;
    int statuspegawai;

    void inputkaryawan() throws IOException
{
    BufferedReader keyboard = new BufferedReader
    (new InputStreamReader(System.in));
    System.out.println("Data karyawan : ");
    System.out.println("NIP            :");
    nip = keyboard.readLine();
    System.out.println("Nama : ");
    nama = keyboard.readLine();
    System.out.print  ("Status Pegawai : ");
    statuspegawai=Integer.parseInt(keyboard.readLine());
}
}



