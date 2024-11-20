public class passfailactivity {
    private double minimumPassingScore;//-minimumpassingscore : double

    public passfailactivity(double minimumPassingScore)//+passfailactivity(min : double)
    {this.minimumPassingScore = minimumPassingScore;}

    public char getgrade ()//+getgradechar() : char
    {
        {if (minimumPassingScore>=70) //tdk ada di diagram
            return 'A';
            else
            return 'E';
         }
    }
}
