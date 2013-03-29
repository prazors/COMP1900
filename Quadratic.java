
/*
Description of the Program: Has a method that takes parameters for the coefficients a, b, and c, then returns the solution to the cubic equation.
                            Has another method that allows the user to enter values for a, b, c then calls the first method and displays the result.
Author: James Atwood    
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/6/2013
Lab-num In/Hw: Lab-5 In
*/
import java.util.*;
public class Quadratic
{
    public static double cubicQuad(double a, double b, double c)
    {
        double p, q, u, x, y, z;
        
        //this block calculates p a q
        p = b - ((Math.pow(a, 2)) / 3);                                 
        q = c + ((2 * (Math.pow(a, 3)) - (9 * a * b)) / 27);
        
        //this block of code will partition the square root values into a separate variable for clarity
        y = ((Math.pow(q, 2)) / 4) + ((Math.pow(q, 3)) / 27);           
        y = Math.sqrt(y);
        z = ((-q / 2) + y);
        
        //this block calculates u
        u = Math.pow(z, (1/3));
        
        //this block puts everything together and returns the final value
        x = u - (p / (3 * u)) - (a / 3);
        return x;
    }
    
    public static void main(String[] args)
    {
        double a, b, c;
        double answer;
        
        Scanner input = new Scanner(System.in);
        
        //these sections gather the user input for values a, b and c
        System.out.println("enter a value for a ");
        a = input.nextDouble();
        
        System.out.println("enter a value for b ");
        b = input.nextDouble();
        
        System.out.println("enter a value for c ");
        c = input.nextDouble();
        
        //assign the variable answer, to the method call, cubicQuad()
        answer = cubicQuad(a, b, c);
        
        System.out.println(answer);
        
        
    }
    
}
