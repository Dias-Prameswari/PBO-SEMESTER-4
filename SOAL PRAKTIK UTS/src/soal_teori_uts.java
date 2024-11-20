public class soal_teori_uts {
    public static void main(String[]args)
    {
        Nilai obj = new Nilai(90, 90, 85);
        obj.nim = "A.11.";
        obj.nama = "Najma";
        obj.na = (obj.tgs + obj.uts + obj.uas)/3;
        obj.cetak1();
        obj.cetak1("Nilai");
    }
}
class mhs{
    String nim, nama;
    float tgs, uts, uas;
    mhs(float a, float b, float c)
    {
        tgs = a;
        uts = b;
        uas = c;
    }
    void cetak1()
    {
        System.out.println("Nama : "+nama);
        System.out.println("Tugas : "+tgs);
        System.out.println("UTS : "+uts);
        System.out.println("UAS : "+uas);
    }
    void cetak1(String s)
    {
        System.out.println(s);
    }
}

class Nilai extends mhs{
    float na;
    Nilai(float l, float m, float n)
    {
        super(l,m,n); na=0;
    }
    void cetak1()
    {
        super.cetak1("Mahasiswa");
        super.cetak1();
    }
    void cetak1(String x)
    {
        System.out.println(x);
        System.out.println("Nim : "+super.nim);
        System.out.println("Nim : "+super.nama);
        System.out.println("Tugas : "+tgs);
        System.out.println("UTS : "+uts);
        System.out.println("UAS : "+uas);
        System.out.println("NA : "+na);
    }
}