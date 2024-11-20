class persegipanjang {
    double p,l,luas;
    void hitungluas()
    {
        luas = p * l;
    }
    void cetak()
    {
        System.out.println("Panjang \t: "+p);
        System.out.println("Lebar \t: "+l);
        System.out.println("Luas \t: "+luas);
    }

    double pertambahan(double a, double b, double c){
        return a + b + c;
    }
    double pengurangan(double a, double b, double c){
        return a - b - c;
    }
    double perkalian(double a, double b, double c){
        return a * b * c;
    }
    double pembagian(double a, double b, double c){
        if (b == 0 || c == 0)
        {
            throw new IllegalArgumentException("Divisor cannot be 0(zero)");
        }
        return a / b / c;
    }

}

class Balok extends persegipanjang{
    double t,volume;
    void hitungvolume()
    {
        volume = luas * t;
    }
    void cetak()
    {
        super.cetak();
        System.out.println("Tinggi\t: "+t);
        System.out.println("Volume\t: "+volume);
    }
    void cetak(String nama)
    {
        System.out.println("Balok\t: "+nama);
        cetak();
    }

    double pertambahan(double a, double b, double c){
        return super.pertambahan(a,b,c);
    }
    double pengurangan(double a, double b, double c){
        return super.pengurangan(a,b,c);
    }
    double perkalian(double a, double b, double c){
        return super.perkalian(a,b,c);
    }
    double pembagian(double a, double b, double c){
        return super.pembagian(a,b,c);
    }

}

public class Polymorphism{
    public static void main(String[]args)
    {
        Balok balok = new Balok();
        balok.p = 10;
        balok.l = 5;
        balok.t = 5;
        balok.hitungluas();
        balok.hitungvolume();
        balok.cetak();
        System.out.println(" ");
        balok.l = 7;
        balok.hitungluas();
        balok.hitungvolume();
        balok.cetak("Balokku");
        System.out.println("\n");
        System.out.println("Pertambahan : "+balok.pertambahan(12.5,28.7,14.2));
        System.out.println("Pengurangan : "+balok.pengurangan(12.5,28.7,14.2));
        System.out.println("Perkalian : "+balok.perkalian(12.5,28.7,14.2));
        System.out.println("Pembagian : "+balok.pembagian(12.5,28.7,14.2));


    }
}