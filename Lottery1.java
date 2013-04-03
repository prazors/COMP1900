
/**
 * Write a description of class Lottery1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Lottery1
{
     public static int[] rollDieList(int rolls)
     {
        int results[] = new int[rolls];       
        
        while((rolls) > 0)
        {
            results[rolls - 1] = (int)(35 * Math.random());
            rolls = rolls - 1;
        }
               
        return results;
                
    }
    
    
    
    
    
    //finds the partial factorial for the numerator and the regular factorial for the denominator and then divides by their results
    public static double jackpotChance(int n, int k)
    {
        
        double d = k;        //transfer k as double
        double x = d;        //d is the denominator
        double z = n;        //transfer n as a double
        double y = z;        //z will decrement the value original of y, and y becomes the numerator after processing
        k = n - (k - 1);     //k is now the holder of the lower limit bound
        
        
        /** Calculate the partial factorial, y becomes the numerator */
        while (z > k)
        {
            z = z - 1;
            y = y * z;                
        }
        
        
        /** Calculate the regular factorial, d becomes the denominator */
        while (x > 1)
        {
            x = x - 1;
            d = d * x;            
        }
        
        
        return (y / d);
    }
    
    
    
    
    public static double jackpotChance(int k, int n, int m)
    {
        
        
        
        return 1;
    }
    
    
    
    
    //this section actually simulates matches of random numbers from die rolls (not related to the lottery game)
    public static void main2(String args[])
    {
        while (true)
        {
            int a[] = rollDieList(3);
            int b[] = rollDieList(3);
            int c[][] = new int[2][];
            c[0] = a;
            c[1] = b;
            
            int k, n, m;                    //k is the number of distinct numbers that are allowed to be chosen
                                            //n is the upper limit of any chosen number
                                            //m is an extra integer chosen, it has an upper limit, n
           
            for (int i = 0; i < a.length; i++)
            {
                System.out.print(" " + a[i]);
            }
            
            System.out.println();
            for (int i = 0; i < b.length; i++)
            {
                System.out.print(" " + b[i]);
            }
          
          
          
            
            
            //This section of code will sort 2 arrays in ascending order
            for (int x = 0; x < c.length; x++)
            {
                    
                int i = 0;
                int j = 1;
                int holder;  
                
                //this loop will continue to swap does the actual swap
                while (j < c[x].length)
                {
                    //test if swapping is necessary
                    if (c[x][i] > c[x][j])
                    {
                        //swaps the value of a[i] with a[j] so that the higher value is moved back towards the beginning of the array
                        holder = c[x][i];
                        c[x][i] = c[x][j];
                        c[x][j] = holder;
                        
                        //resets the indices i, j, back to 0 and 1
                        i = 0;
                        j = 1;
                        
                    }
                    //if a swap wasn't needed, then simply increment the indices i, j
                    else
                    {
                        i++;
                        j++;
                    }
                                    
                }       
                
            }
            
            
            
            
            
            
            
            
            int count = 0;          //counts number of matches
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] == b[i])
                {
                    count += 1;
                    
                }
            
            
            
            }
            
            System.out.println();
            
            if (count == a.length)
            {
            
                System.out.println("You win!");
                break;
            }
        }
    }
    
    public static void main(String args[])
    {
//         double n, k;
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter the max number a person may choose");
//         n = input.nextInt();
//         
//         System.out.println("enter the number of numbers a person may choose");
//         k = input.nextInt();
//         
//         n = numerator(n, k);
//         k = denominator(k);
//         
//         System.out.println(n/k);
//         
        
    }
   
}
