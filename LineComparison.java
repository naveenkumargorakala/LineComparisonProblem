import java.util.*;
import java.lang.Math.*;
public class LineComparison
{
   public static void main(String args[])
   {
      System.out.println("Welcome to Line Comparison Computation");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a point");
      int x1 = input.nextInt();
      int y1 = input.nextInt();
      System.out.println("Enter b point");
      int x2 = input.nextInt();
      int y2 = input.nextInt();
      int len1 = (int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      System.out.println("length is: "+len1);
      System.out.println("Enter c point");
      int x3 = input.nextInt();
      int y3 = input.nextInt();
      System.out.println("Enter d point");
      int x4 = input.nextInt();
      int y4 = input.nextInt();
      int len2 = (int) Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
      System.out.println("length is: "+len2);
      if(len1==len2)
      {
         System.out.println("both the line lengths are equal");
      }
      else if(len1>len2)
      {
         System.out.println("ab line is long");
      }
      else
      {
         System.out.println("cd line is long");
      }
    }
}