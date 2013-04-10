/*
Description of the Program: Contains several methods that use recursion to calculate results
Author: James Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 4/11/2013
Lab-num In/Hw: Lab-9 ini
*/

import java.util.*;
public class Recursion
{
    public static void superFan(int n)
    {   
        //if n is equal to zero, then we simply use a return statement to exit the method
        if (n == 0)
        {
            return;                                     //note that it returns nothing
            
        }
        System.out.println("Memphis Tigers");       
        superFan(n - 1);                                //simply call the method, except decrement n next time
             
    }
    
    //computes the sum of a sequence of numbers (series)
    public static double series(double n)
    {
       
        if (n == 0)
        {
            return  n;                              //if n equals zero then we return the final sum of the sequence
        }
        else
        {
            return 1 / n + series(n - 1);           //the series is the sum of the sequence of descending numbers (i.e. 1/4, 1/3, 1/2, 1/1)
        }
                
    }
    
    //takes two positive integer parameters m and n and returns the product using repeated addition
    public static int multiply(int m, int n)
    {
        if (n == 1)
        {
            return m;                  //if n = 1, which is the last multiple
        }
        else
        {
            return m + multiply(m , (n - 1));       //multiplication is the addition of m, n number of times
        }
                
    }
    
    //prints an integer value in reverse    
    public static void reverseDisplay(int n)
    {
        
        if (n == 0)
        {
            return;
        }
        else
        {          
            System.out.print("\t" + n % 10);                //does modulus division and stores the remainder (i.e. 53 remainder --> 3)
            n = n / 10;                                     //reduce n to its integer quotient (i.e 53 ----> 5)
            reverseDisplay(n);
        }
                    
    }
    
    //main method
    public static void main(String args[])
    {
                
        
    }
}
