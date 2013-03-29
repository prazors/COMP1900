/*
Description of the Program: A method that finds the min/max and average for a given array, then prints it out.
Author: James Atwood and Bryan Smith
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/27/2013
Lab-num In/Hw: Lab-7 In
 */
import java.util.*;
public class ArrayMethods
{
    public static double[] getArrayStats(double[] a)
    {
        double b[] = new double[3];         //array b will hold the indices 0, 1, and 2
        
        double max = a[0], min= a[0];
        
        double sum = 0, count = 0;
       
        //this loop will iterate through the indices of an array of any length
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max)                  //test for the max value in each index
            {
                max = a[i];
            }
            
            if(a[i] < min)                  //test for the min value in each index
            {
                min = a[i];                
            }
            
            sum = sum + a[i];               //add up all of the values to the final sum
            count = count + 1;
            
        }
        
        b[0] = min;                         //assign min to the index 0 of the new array
        b[1] = (sum / count);               //assign the average to index 1
        b[2] = max;                         //assign the max to index 2
        
        return b;
        
    }
    
    //test method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a[] = new double[10];
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("enter a value");
            a[i] = input.nextDouble();   
        }
        
        double b[] = new double[3];
        b = getArrayStats(a);
        
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

    }
}
