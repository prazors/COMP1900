
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Integers
{
    // instance variables - replace the example below with your own
 public static void main(String[] args)
     {
         int int1;
         int int2;
         int int3;
         int total = 0;
         
     Scanner keyin = new Scanner(System.in);
     System.out.println("What is the first integer?");
     int1 = keyin.nextInt();
     System.out.println("What is the second integer?");
     int2 = keyin.nextInt();
     System.out.println("What is the third integer?");
     int3 = keyin.nextInt();
     
     if (int1 > 0)
     {
         total = int1;
     }
     
     
     if (int2 > 0)
     {
         total = total + int2;
        }
        
     
     if (int3 > 0)
     {
        total = total + int3;
     }
     if (true)
     {
         
         
     }
     
     
     System.out.println(total);
}
}

