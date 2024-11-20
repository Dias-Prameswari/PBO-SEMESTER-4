public class diagram {
    public static void main(String[]args)
    {
        shape s1 = new shape();
        System.out.println(s1);

        shape s2 = new shape("green", false);
        System.out.println(s2);

        s1.setColor("blue");
        s1.setFilled(true);

        System.out.println(s1);
        System.out.println("color : "+s1.getColor());
        System.out.println("filled :"+s1.isFilled());
        System.out.println("\n");

        circle c1 = new circle();
        System.out.println(c1);

        circle c2 = new circle(1.1);
        System.out.println(c2);

        circle c3 = new circle(2.2, "green", false);
        System.out.println(c3);

        c1.setColor("orange");
        c1.setFilled(true);
        c1.setRadius(8.8);
        System.out.println(c1);

        System.out.println("color : "+c1.getColor());
        System.out.println("filled : "+c1.isFilled());
        System.out.println("radius : "+c1.getRadius());
        System.out.printf("area : %.2f%n", c1.getArea());
        System.out.printf("color : %.2f%n",c1.getPerimeter());
        System.out.println("\n");

        rectangle r1 = new rectangle();
        System.out.println(r1);
        rectangle r2 = new rectangle(1.1, 2.2);
        System.out.println(r2);
        rectangle r3 = new rectangle(3.3, 4.4, "green", false);
        System.out.println(r3);
        r1.setWidth(5.5);
        r1.setLength(6.6);
        r1.setColor("orange");
        r1.setFilled(true);
        System.out.println(r1);

        System.out.println("color : "+r1.getColor());
        System.out.println("filled : "+r1.isFilled());
        System.out.println("radius : "+r1.getLength());
        System.out.printf("area : %.2f%n", r1.getArea());
        System.out.printf("color : %.2f%n",r1.getPerimeter());
        System.out.println("\n");

        square sq1 = new square();
        System.out.println(sq1);
        square sq2 = new square(1.1);
        System.out.println(sq2);
        square sq3 = new square(2.2, "green", false);
        System.out.println(sq3);

        sq1.setside(3.3);
        sq1.setColor("orange");
        sq1.setFilled(false);
        System.out.println(sq1);
        System.out.println("color : "+sq1.getColor());
        System.out.println("filled : "+sq1.isFilled());
        System.out.println("side : "+sq1.getSide());

        sq1.setWidth(4.4);
        System.out.println(sq1);
        System.out.println("width : "+sq1.getWidth());

        sq1.setLength(5.5);
        System.out.println(sq1);
        System.out.println("length : "+sq1.getLength());

        System.out.printf("area : %.2f%n", sq1.getArea());
        System.out.printf("color : %.2f%n",sq1.getPerimeter());

    }
}

class  shape{
    private String color = "red";
    private boolean filled = true;

    public shape(){}
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {return color;}

    public void  setColor(String color)
    {this.color = color;}

    public boolean isFilled()
    {return filled;}

    public void setFilled(boolean filled)
    {this.filled = filled;}

    public String toString()
    {
        return "Shape[color=" +color+ "," + "filled=" +filled+ "]";
    }
}

class circle extends shape{
    private double radius = 1.0;

    public circle(){}

    public circle(double radius)
    {this.radius = radius;}

    public circle(double radius, String color, boolean filled)
    {

        super(color,filled);
        this.radius = radius;
    }

    public double getRadius()
    {return this.radius;}

    public void setRadius(double radius)
    {this.radius = radius;}

    public double getArea()
    {return this.radius;}

    public double getPerimeter()
    {return this.radius;}

    @Override
    public String toString() {
        return "circle[shape" + "[color=" + getColor() + "," +"filled="
                +isFilled()+ "]," +"radius="+ radius + "]";
    }
}

class rectangle extends shape{
    private double width = 1.0;
    private double length = 1.0;

    public rectangle(){}

    public rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {return this.width;}

    public void setWidth(double width)
    {this.width = width;}

    public double getLength()
    {return this.length;}

    public void setLength(double length)
    {this.length = length;}

    public double getArea()
    {return length * width;}

    public double getPerimeter()
    {return 2*length + 2*width;}

    @Override
    public String toString() {
        return "Rectangle[shape" +"[color="+ getColor()
                +","+ "filled=" +isFilled()+ "]," +"width"+
                width+ "," +"length="+ length+ "]";
    }
}

class square extends rectangle{
    private double side;

    public square()
    {super();}

    public square(double side)
    {super(side, side);}

    public square(double side, String color, boolean filled)
    {super(side, side, color, filled);}

    public double getSide()
    {return this.side;}

    public void setside(double side)
    {this.side = side;}

    public void setWidth(double side)
    {super.setWidth(getWidth());}

    public void setLength(double side)
    {super.setLength(getLength());}

    public String toString()
    {return "Square[Rectangle" +"["+ "shape" +"["+ "color="
            +getColor()+ "," +"filled="+ isFilled() +"],"+
            "Width=" +getWidth()+ "," +"length="+ getLength()
            +"]";

    }
}