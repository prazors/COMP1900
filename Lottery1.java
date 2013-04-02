
/**
 * Write a description of class Lottery1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    
    public static void main(String args[])
    {
        while (true)
        {
          int a[] = rollDieList(3);
          int b[] = rollDieList(3);
          int c[][] = new int[2][];
          c[0] = a;
          c[1] = b;
          
          
          
          
          
        //This section of code will take a 2D array of integers and sort them in ascending order. Each array must be of the same length and type (int)
        for (int x = 0; x < c.length; x++)
        {
                
            int i = 0;
            int j = 1;
            int holder;    
            //this loop will continue to swap variables until swapping is no longer used through a complete traversal of the array
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
            
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(" " + a[i]);
        }
        
        System.out.println();
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(" " + b[i]);
        }
        System.out.println();
        
        if (count == a.length)
        {
        
        System.out.println("You win!");
        break;
    }
    }
}
   
}
