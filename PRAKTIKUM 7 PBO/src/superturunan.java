class one
{
    one(String s)
    {
        System.out.println("satu.."+s);
    }
}

class two extends one{
    two(String s){
        super(s);System.out.println("dua....");
    }
}

class three extends two{
    three(String s){
        super(s);System.out.println("tiga....");
    }
}

class four extends three{
    four(String s){
        super(s);System.out.println("empat...");
    }
}


public class superturunan {
    public static void main(String[]args)
    {
        new four("noah sebastian");
    }
}
