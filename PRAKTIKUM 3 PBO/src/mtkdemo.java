public class mtkdemo {
    //code dari hasil pembelajaran praktik dosen
//latihan 1/soal 1
//pertambahan = 20 + 20 = 40
//pengurangan = 10 - 5 = 5
//perkalian = 10 x 20 = 200
//pembagian = 20 / 2 = 10
// a=20 ,b=20, c=10, d=5, e=2
    public static void main(String[]args)
    {
        mtk mat = new mtk();
        mat.a=20;
        mat.b=20;
        mat.c=10;
        mat.d=5;
        mat.e=2;
        mat.pertambahan();
        mat.pengurangan();
        mat.perkalian();
        mat.pembagian();

        //hitungan data dapat menampung pecahan
        mat.z=30;
        mat.x=40;
        mat.y=50;
        mat.w=9;
        mat.t=12;
        mat.Addition();//pertambahan
        mat.Subtraction();//pengurangan
        mat.Multiplication();//perkalian
        mat.Division();//pembagian

    }
}
