public class finalexam extends gradeactivity
{
    private int nummberOfQuestions; //-numberofquestions : int
    private int numberMissed; //-numbermissed : int
    double pointsPerQuestion; //-pointsperquestion : int
    //disoal pake tanda -/private tp terjadi error jdi diubah ke public/+

    public finalexam (int question, int missed)//+finalexam(question) : int, missed :int
    {
        nummberOfQuestions=question; 
        numberMissed = missed;
        
    }

    public double getpointsperquestion ()//+getpointsperquestion() : double
    {
        return nummberOfQuestions * pointsPerQuestion;
    }
    
    public int getnumbermissed()//+getnumbermissed() : int
    {return numberMissed;}

}
