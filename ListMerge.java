
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
                
                min = b[i];
                j++;
                
            }
            
            c[k] = min;
        }
        
        return c;
    }
    
    
    public static void main(String args[])
    {
        
        
        
        int a[] = {23, 17, 4, 54, 9};
        int b[] = {43, 2, 19, 12};
        
        int c[] = listMerge(a, b);
        
        for (int i = 0; i < c.length; i++)
        {
            System.out.print(c[i] + " ");          
            
        }
        
        
        
    }
}