import java.io.*;

public class karyawakontrak extends karyawanbru{
    double upahharian;
    int jumlahanak;
    int harimasuk;

    void inputkontrak() throws IOException
    {
        BufferedReader keyboard = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.println("--Karyawan kontrak--");
        System.out.print("Upah harian :");
        upahharian = Double.parseDouble(keyboard.readLine());
        System.out.print("jumlah masuk : ");
        harimasuk = Integer.parseInt(keyboard.readLine());
        System.out.print("jumlah anak : ");
        jumlahanak = Integer.parseInt(keyboard.readLine());

    }

    double totalupah()
    {
        return (harimasuk * upahharian) + (jumlahanak * (0.1 * (harimasuk*upahharian)));
    }
}
