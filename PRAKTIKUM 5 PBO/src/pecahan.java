//sesuai soal dosen
//latihan 2
//tidak memasukkan inputan
public class pecahan {
    public static void main(String[]args)
    {
        int bilangan = 20;
        int pecahan = 3;
        int angkabaris = 4;
        System.out.println("Bilangan : "+bilangan);
        for (int i = 1; i <= bilangan; i++)
        {
            System.out.print(i + " ");
            if (i % angkabaris == 0 )
            {
                System.out.println();
            }
        }

        System.out.println("--------------------------");
        System.out.println("Dipecah : "+pecahan);
        for (int i = 1; i <=bilangan; i++)
        {
            System.out.print(i + " ");
            if (i % pecahan == 0)
            {
                System.out.println();
            }
        }
    }
}
