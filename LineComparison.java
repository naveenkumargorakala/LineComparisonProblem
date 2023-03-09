import java.util.*;
import java.lang.Math.*;
public class LineComparison
{
   public static void main(String args[])
   {  
      int line1,line2;
      System.out.println("Welcome to Line Comparison Computation");
      LineComparison length1 = new LineComparison();
      LineComparison length2 = new LineComparison();
      line1=length1.distance(7,6,14,10);
      System.out.println("line1 is: "+line1);
      line2=length2.distance(33,45,26,49);
      System.out.println("line2 is: "+line2);
      if(line1==line2)
         System.out.println("Distances are equal");
      else if(line1>line2)
         System.out.println("length1 is greater ");
      else
         System.out.println("length2 is greater");
   }
   public int distance(int x1,int y1,int x2,int y2)
   {  
      int dist = (int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      return dist;
   }
}