public class suhu {
    int c;
    float hasil;
    public suhu(int c)
    {
        this.c=c;
    }

    void cKelvin(int c)
    {
        hasil = c + 273.15f;
        System.out.println(c+"° Kelvin : "+hasil+" K");
    }
    void cFahrenheit(int c)
    {
        hasil = c * 1.8f + 32;
        System.out.println(c+"° Fahrenheit : "+hasil+" °F");
    }
    void cRankine(int c)
    {
        hasil = c * 1.8f + 491.67f;
        System.out.println(c+"° Rankine : "+hasil+" °Ra");
    }
    void cDelisle(int c)
    {
        hasil = (100 - c) * 1.5f;
        System.out.println(c+"° Delisle : "+hasil+" °De");
    }
    void cNewton(int c)
    {
        hasil = c * 33/100f;
        System.out.println(c+"° Newton : "+hasil+" °N");
    }
    void cReaumur(int c)
    {
        hasil = c * 0.8f;
        System.out.println(c+"° Reaumur : "+hasil+"° Re");
    }
    void cRomer(int c)
    {
        hasil = c * 21/40f + 7.5f;
        System.out.println(c+"° Romer : "+hasil+"° Rø");
    }

}
