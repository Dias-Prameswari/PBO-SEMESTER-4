class airplane{
    int sayap;//2
    int ekor;//1

    public airplane(){
        this.sayap = 2;
        this.ekor = 1;
        System.out.println("Object Pesawat Dibuat.....");
    }
    void terbang(){
        System.out.println("Terbang.....");
    }
    void mendarat(){
        System.out.println("Mendarat.....");
    }
}

class fighter_airplane extends airplane{
    public fighter_airplane(){
        System.out.println("Object Pesawat Tempur Dibuat.....");
    }
    void manuver(){
        System.out.println("Manuver.....");
    }
    void terbang(){
        super.terbang();
        System.out.println("Terbang ala tempur.....");
    }
}

public class Pesawat {//test pesawat
    public static void main(String []args)
    {
        airplane airbus = new airplane();
        fighter_airplane f16 = new fighter_airplane();
        System.out.println("......airbus......");
        airbus.terbang();
        airbus.mendarat();
        System.out.println(".....f16.....");
        f16.terbang();
        f16.mendarat();
        f16.manuver();
    }
}
