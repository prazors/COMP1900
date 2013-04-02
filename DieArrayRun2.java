
/**
 * Write a description of class DieArrayRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class DieArrayRun2
{
    //method for a random die generator that puts the results into an array
    public static int[] rollDieList(int rolls)
    {
        int results[] = new int[rolls];       
        
        while((rolls) > 0)
        {
            results[rolls - 1] = (int)(6 * Math.random());
            rolls = rolls - 1;
        }
               
        return results;
                
    }
    
    //this method makes the 2D array
    public static int[][] returnArray()
    {
     
        int a[] = rollDieList(20);
        int incr = 0;
        int i = 0;
        int runlen = 0;
        int count = 0;              //count the number of runs
        boolean place = false;        //marks when and when NOT to begin counting the number of runs
        
            //this loop simply counts the number of runs in a sequence
            //example if a[i] = {2, 2, 1, 3, 9, 9, 9, 14, 1} then the count is 2
            for (int j = 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    
                    place = true;
                    incr += 1;
                    i++;
                }
                
                else if (place == true)
                {
                    count += 1;
                    place = false;
                    i++;
                }
                else
                {
                    i++;
                }
                
            }
            
       
            
            int b[] = new int[20  - (incr)];              //creates a new array based on the original results minus the number of runs
            
            place = false;
            
            int k = 0;
            i = 0;
            int j = 1;
            //this loop counts the run lengths of each run (as well as the 'non-runs') and assigns them to the indices of b, this is necessary so that
            //the 2D array c will know the length of each of its sub arrays
            //example b[k] = {2, 1, 1, 3, 1, 1}
            while( k < b.length && j < a.length )
            {

                
                
                    if (a[i] == a[j])
                    {
                        
                        runlen += 1;
                        place = true;
                        i++;
                        j++;
                        b[k] = runlen + 1;
                        
                    }
                    else if (place == true)
                    {
                        //runlen += 1;
                        b[k] = runlen + 1;
                        place = false;
                        
                        k++;
                        i++;
                        j++;
                        runlen = 0;
                        
                    }
                    else 
                    {
                        b[k] = runlen + 1;
                        
                        k++;
                        i++;
                        j++;
                        //runlen = 0;
                    }
                    
                    
               
                
                
            }
            
            if(b[b.length-1] == 0)
            {
                b[b.length-1] = 1;
            }
            
            //array c will be the 2D jagged array
            int c[][] = new int[b.length][];
            
            for(int n = 0; n < b.length; n++)
            {
                c[n] = new int[b[n]];
                
                
            }
            
            
        
    
        for (int q = 0; q < c.length; q++)
        {
            
            for (int p = 0; p < c[q].length; p++)
            {
                c[q][p] = a[q];
                
            }
           
            
        
        }
            
            for(int s = 0; s < a.length; s++)
            {
                System.out.print(a[s]);
            }
          System.out.println();
          
          for (int t = 0; t < b.length; t++)
            {
                System.out.print(b[t]);
                
            }
            System.out.println();
            return c;
            
            
        }
        
    public static void main()
    {
        int a[][] = returnArray();
        int i = 0;
        
    
        while (i < a.length)
        {
            
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j]);
                
            }
            i++;
            System.out.print(", ");
        
        }
    }
        
        
    }
        
        
        
        
        
        
    
    
    
    

    
