import Transportasi.BicycleDemo;
import Transportasi.Main;

public class TransportasiDemo {
    public static void main(String []args)
    {
        BicycleDemo b = new BicycleDemo();
        b.cetak();
        System.out.println("\n");
        Main mobil = new Main();
        mobil.cetak2();
    }
}
