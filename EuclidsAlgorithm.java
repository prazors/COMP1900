
/*
 * Write a description of class GreatestDivisor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class EuclidsAlgorithm
{   //this method will find the greatest common divisor between two integers using Euclid's Algorithm
    public static void main(String[] args)
    {
        int integerA, integerB;       
        int holder;                 //temporarily holds integerB
                               
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        integerA = keyboard.nextInt();
        
        System.out.println("Enter the second integer: ");
        integerB = keyboard.nextInt();
        
        while (integerA%integerB > 0)                      //while the result of modulus division is greater than zero
        {
            holder = integerB;                              //store integerB in holder
            integerB = (integerA%integerB);
            integerA = holder;                             //store the old integerB in integerA
        }
        
        System.out.println(integerB);
    }
}
