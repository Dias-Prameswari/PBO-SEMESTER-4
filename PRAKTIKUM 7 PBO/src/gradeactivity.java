public class gradeactivity {

   private double score;//-score : double. tanda (-) = private
   private String nama;//-name : string. tanda (-) = private

    // Constructors 
   public gradeactivity(){}//+gradedactivity(). tanda (+) = public
                           
   public gradeactivity(String n) //+gradedactivity(n : string)   
   { nama=n; }        

   // Mutator methods
   public void setscore(double s)//+setscore(s : double) : void. 
   { score=s;}         

   public double getScore()//+getscore():double
   { return score;}

   public char getGrade()//+getgrade():char
   {if (score>=70) //tdk ada di diagram
      return 'A';
      else
      return 'E';
   }

}

