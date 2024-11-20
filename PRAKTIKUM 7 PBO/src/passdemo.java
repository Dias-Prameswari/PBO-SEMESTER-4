public class passdemo {
    public static void main(String[] args) {
        passfailexam ojk = new passfailexam(10,2,70);
        System.out.println("points : " + ojk.getpointseach());
        System.out.println("missed : " + ojk.getnummissed());
        System.out.println("minimum : " + ojk.getMinimumPassingScore());

        passfailactivity act = new passfailactivity(70);
        System.out.println("grade : " + act.getgrade());
    }
}
