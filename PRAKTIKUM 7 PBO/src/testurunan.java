class satu
{
    satu()
    {
        System.out.println("satu..");
    }
}

class dua extends satu{
    dua(){
        System.out.println("dua....");
    }
}

class tiga extends dua{
    tiga(){
        System.out.println("tiga....");
    }
}

class empat extends tiga{
    empat(){
        System.out.println("empat...");
    }
}

public class testurunan {
    public static void main(String []args)
    {
        new empat();
    }
}
