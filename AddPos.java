
/**
 * Write a description of class AddPos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class AddPos
{
    public static void main(String[] args)
    {
        int integerHolder = 0;
        int userInt = 0;
        
        Scanner keyboardin = new Scanner(System.in);
        
        System.out.println("what is the 1st integer?");
        userInt = keyboardin.nextInt();
        if (userInt > 0)
        {
            integerHolder = userInt;
            
        }
        
        System.out.println("what is the 2nd integer?");
        userInt = keyboardin.nextInt();
        if (userInt > 0)
        {
            integerHolder = integerHolder + userInt;
        }
        
        System.out.println("what is the 3rd integer?");
        userInt = keyboardin.nextInt();
        if (userInt > 0)
        {
            integerHolder = integerHolder + userInt;
        }
        
        System.out.println("what is the 4th integer?");
        userInt = keyboardin.nextInt();
        if (userInt > 0)
        {
            integerHolder = integerHolder + userInt;
        }
        
        System.out.println("what is the 5th integer?");
        userInt = keyboardin.nextInt();
        if (userInt > 0)
        {
            
            integerHolder = integerHolder + userInt;
        }
        
        System.out.println("the sum is " + integerHolder);
    }
}
