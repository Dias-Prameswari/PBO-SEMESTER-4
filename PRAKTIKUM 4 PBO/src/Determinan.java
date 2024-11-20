//praktik 4 soal no 2 :
import java.util.Scanner;
public class Determinan {
    int a,b,c;
    long d;
    double x1,x2;
    Scanner myObj = new Scanner(System.in);
    void inputData()
    {
        System.out.println("a : ");a=myObj.nextInt();
        System.out.println("b : ");b=myObj.nextInt();
        System.out.println("c : ");c=myObj.nextInt();
    }
    //rumus determinan : D=b²-4ac
    void hitungD()
    {
        d=(b*b)-(4*a*c);
    }

    void hitungX()
    {
        if (d>0)
        {
            //math.sqrt = akar kuadrat
            //jika D > 0, maka rumus ABC : x1 = -b + √D / 2a
            x1=(-b+Math.sqrt(d))/(2*a);
            //x2 = -b - √D / 2a
            x2=(-b-Math.sqrt(d))/(2*a);
        } else if (d==0)
        {
            //jika D = 0, maka rumus ABC :
            // x1 = x2 = -b / 2a
            x1=x2=-b/(2*a);
        }
        else {
            //jika D < 0, maka rumus ABC akan menghasilkan akar imajiner :
            // x1 = -b/2a + √-D / 2a
            x1=-b/(2*a)+Math.sqrt(-d)/(2*a);
            // x2 = -b/2a - √-D / 2a
            x2=-b/(2*a)+Math.sqrt(-d)/(2*a);
        }
    }
    void cetak()
    {
        System.out.println("D : "+d);
        System.out.println("X1 : "+x1);
        System.out.println("X2 : "+x2);

    }
}
