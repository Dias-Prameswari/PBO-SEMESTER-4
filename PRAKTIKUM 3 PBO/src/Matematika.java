//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Matematika {
//code yang ak buat sendiri
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //variable (soal 1 A):
        int pertambahan = 0;
        int pengurangan = 0;
        int perkalian = 0;
        int pembagian = 0;

        //method (soal 1 A):
        void setPertambahan(int a,int b)
        {
            pertambahan = a + b;
            System.out.println("Pertambahan : "+a+ " + " +b+ " = " +pertambahan);
        }

        void setPengurangan(int a,int b)
        {
            pengurangan = a - b;
            System.out.println("Pengurangan : "+a+ " - " +b+ " = " +pengurangan);
        }

        void setPerkalian(int a,int b)
        {
            perkalian = a * b;
            System.out.println("Perkalian : "+a+ " x " +b+ " = " +perkalian);
        }

        void setPembagian(int a,int b)
        {
            pembagian = a / b;
            System.out.println("Pembagian : "+a+ " : " +b+ " = " +pembagian);
        }

        //variable (soal 1 C):
        private double pembilang;
        private double penyebut;
        private double pembilang2;
        private double penyebut2;

        public void matematika(double pembilang, double penyebut, double pembilang2, double penyebut2)
        {
            this.pembilang = pembilang;
            this.penyebut = penyebut;
            this.pembilang2 = pembilang2;
            this.penyebut2 = penyebut;
        }

        public double pertambahan2(double z, double x)
        {
            return (pembilang/penyebut) + (pembilang2/penyebut2);
        }
        public double pengurangan2(double z,double x)
        {
            return (pembilang/penyebut) - (pembilang2/penyebut2);
        }
        public double perkalian2(double z,double x)
        {
            return (pembilang/penyebut) * (pembilang2/penyebut2);
        }
        public double pembagian2(double z,double x)
        {
            return (pembilang/penyebut) / (pembilang2/penyebut2);
        }


}