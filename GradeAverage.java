
/**
 * Write a description of class GradeAverage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class GradeAverage
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);

      int grade1;
      int grade2;
      double average;
      
      System.out.println("what is the first grade?");
      grade1 = input.nextInt();
      System.out.println("what is the second grade?");
      grade2 = input.nextInt();
      
      average = (double)(grade1 + grade2)/2;
      System.out.println("your average is " + average + ".");
     
    }
  
}
