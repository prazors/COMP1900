
/**
 * Write a description of class DivisBySeven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class DivisBySeven
{
    
    
    public static void main(String[] args)
    {
        int int1;
        Scanner keyin = new Scanner(System.in);
        
        System.out.println("What is the number?");
        int1 = keyin.nextInt();
        
        if (int1%7 == 0)
        {
            System.out.println("Your number is divisible by seven.");
        }
        else
            System.out.println("Sorry, the number isn't divisible by seven.");
        
    }
}
