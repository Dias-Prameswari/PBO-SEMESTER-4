public class finaldemo {
    public static void main(String[]args)
    {
        finalexam  obj = new finalexam(7,3);
        obj.pointsPerQuestion=10;
        System.out.println("Point : " + obj.getpointsperquestion());
        System.out.println("Missed : " + obj.getnumbermissed());
        obj.setscore(obj.getpointsperquestion());
        System.out.println("Grade : " + obj.getGrade());
        System.out.println("Minimum pass :");

    }
}
