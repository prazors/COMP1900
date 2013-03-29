
/*
Description of the Program: factorial method; computes a given factorial
Author: James Atwood    
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/6/2013
Lab-num In/Hw: Lab-5 In
*/
import java.util.*;
public class ComputeFactorial
{

    public static int factorial(int integer)
    {
        int value = integer;
        if (integer != 0)           //test first if the value is not zero
        {            
            while(integer > 1)      //if the value isn't zero, then iterate through the loop decrementing the integer each time
            {                
                value = value * (integer - 1);
                integer -= 1;
            }
        }
        else
            value = 1;              //if the value is 0 then return 1
        
        return value;
        
    }
    
    //this main method tests the method above
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        
        //gather the integer from the user
        System.out.println("enter a positive integer");
        n = input.nextInt();
        
        n = factorial(n);       //invoke the the factorial method, and assign to n
        
        System.out.println(n);
        

        
    }
}

