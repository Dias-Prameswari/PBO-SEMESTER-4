class workers{
    protected double gajipokok;
    protected int jumlahanak;
    public workers(double gajipokok, int jumlahanak)
    {
        this.gajipokok = gajipokok;
        this.jumlahanak = jumlahanak;
    }

    public double hitungtotalgaji()
    {
        return gajipokok + hitungtunjangananak();
    }
    protected double hitungtunjangananak()
    {
        return jumlahanak * 1000000;
    }
}
//karyawan tetap
class pegawai extends workers{
    public pegawai(double gajipokok, int jumlahanak)
    {
        super(gajipokok, jumlahanak);
    }
}
//karyawan kontrak
class staf extends workers{
    private double upahharian;
    private int jumlahharimasuk;
    public staf(double upahharian, int jumlahharimasuk, int jumlahanak)
    {
        super(0,jumlahanak);
        this.upahharian = upahharian;
        this.jumlahharimasuk = jumlahharimasuk;
    }
    public double hitungtotalgaji()
    {
        return (upahharian * jumlahharimasuk) + hitungtunjangananak();
    }
}

public class karyawan {
public static void main(String []args)
{
    pegawai pegawati = new pegawai(2500000, 2);
    System.out.println("Total gaji karyawan tetap : Rp "+pegawati.hitungtotalgaji());

    staf tenagakerja = new staf(100000, 30, 1);
    System.out.println("Total gaji karyawan kontrak : Rp "+tenagakerja.hitungtotalgaji());

}
}
