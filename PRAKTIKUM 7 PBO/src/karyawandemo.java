import java.io.*;
import java.text.DecimalFormat;

public class karyawandemo {
    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
        karyawanbru kar = new karyawanbru();
        karyawanttp ttp = new karyawanttp();
        karyawakontrak kntrk = new karyawakontrak();

        kar.inputkaryawan();
        if (kar.statuspegawai == 1) {
            ttp.inputtetap();
            System.out.println("gaji diterima :" + df.format(ttp.totalgaji()));
        }else
        {
            kntrk.inputkontrak();
            System.out.println("upah diterima : " + df.format(kntrk.totalupah()));
        }
    }
}
