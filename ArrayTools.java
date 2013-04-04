
/**
 * Write a description of class ArrayTools here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayTools
{

    //this method takes 3 arguments, 1 array, and 2 of its indices. The method swaps the values at the given indices, then returns the array.
    public static int[] swap(int a[], int i, int j)
    {
        
        int k = a[i];
        a[i] = a[j];
        a[j] = k;
        
        return a;
        
    }
    
    //This method takes an array of integers and sorts it from lowest to highest
    public static int[] intArraySort(int a[])
    {
        int i = 0;
        int j = 1;
        int k;
        
            //this loop will continue to swap variables until swapping is no longer used through a complete traversal of the array
            while (j < a.length)
            {
                //test if swapping is necessary
                if (a[i] > a[j])
                {
                    //swaps the value of a[i] with a[j] so that the higher value is moved back towards the beginning of the array
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                    
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
        
        return a;
        
        
    }
    
    
    //this method will sort multiple arrays and return the sorted arrays into a cleanly packaged 2D array.
    public static int[][] arraySortMulti()
    {
          int a[] = {1, 9, 18, 4};
          int b[] = {45, 1, 12, 3};
          int c[][] = new int[2][];
          c[0] = a;
          c[1] = b;         
          
        //This section of code will take a 2D array of integer arrays and sort each one in ascending order. Each array must be of the same length and type (int)
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
        
        return c;
    }
    
    //Method that prints per line, the contents of a 2D array (also works for jagged arrays)
    public static void arrayPrintPerLine()
    {
        int a[][] = arraySortMulti();
        int i = 0;
        
    
        while (i < a.length)
        {
            
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
                
            }
            System.out.println();
            i++;
        
        }
        
    }
    
    public static void main(String args[])
    {
        
        
    }
}
