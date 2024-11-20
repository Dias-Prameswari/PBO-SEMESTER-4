public class passfailexam {
    private int nummberOfQuestions;//-numberofquestion : int
    // double pointsPerQuestion;//-pointsperquestion:double 
    private int numberMissed;//-numbermissed : int
    private double minimumPassingScore;//tdk ada di diagram 
    
    public passfailexam(int question, int missed, double minimpass)
    {
        this.nummberOfQuestions = question;
        this.numberMissed = missed;
        this.minimumPassingScore = minimpass;
    }

    public double getpointseach()
    {
        return  100.0/nummberOfQuestions ;
    }

    public int getnummissed()
    {
        return numberMissed;
    }

    public double getMinimumPassingScore() {
        return minimumPassingScore;
    }

}
