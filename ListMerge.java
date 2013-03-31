
/**
 * Write a description of class ListMerge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ListMerge
{
    

    public static int[] listMerge(int[] a, int[] b)
    {
        int i = 0, j = 0, size = 0;
        int min = a[i];
        
        //this loop determines the minimum size necessary for array c
        while (i < a.length || j < b.length)
        {
                        
            if (i < a.length && j < b.length)
            {
                i++;
                j++;
                size += 1;
            }
            else if (i < a.length)
            {
                i++;
                size += 1;
            }
            else if (j < b.length)
            {
                j++;
                size += 1;
            }
        }
        
        i = 0;
        j = 0;
        
        
        int c[] = new int[size];
        
        for (int k = 0; k < c.length; k++)
        {
           
            
            if (i < a.length && j < b.length)
            {
                
                
                
                if (a[i] > b[j])
                {
                    min = b[j];
                    j++;
                    i++;
                    
                }
                else if (a[i] < b[j])
                {
                    min = a[i];
                    i++;
                    j++;
                }
                else
                {
                    min = a[i];
                    i++;
                    j++;
                }
                
            }
            else if (i < a.length)
            {
                
                min = a[i];
                i++;
                
            }
            else if (j < b.length)
            {
                
                min = b[j];
                j++;
                
            }
            
            c[k] = min;
        }
        
        return c;
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
    
    public static void main(String args[])
    {
        
        
        
        int a[] = {5, 3, 1, 9, 7};
        int b[] = {43, 2, 19, 12, 99, 23, 82};
        
        a = intArraySort(a);
        b = intArraySort(b);
        
        int c[] = listMerge(a, b);
        
        int[] d[] = {a, b, c};
        char mychar = 'a';
        for (int i = 0; i < 3; i++)
        {
            System.out.print("List " + mychar + ":\t");
            for (int j = 0; j < d[i].length; j++)
            {
                System.out.print(d[i][j] + "\t");          
                
            }
            System.out.println();
            mychar++;
        
            
        }
        
        
    }
}