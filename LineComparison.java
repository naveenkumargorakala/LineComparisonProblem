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
      int len = (int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      System.out.println("length is: "+len);
    }
}