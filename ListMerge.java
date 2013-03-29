
/**
 * Write a description of class ListMerge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
                i++;
                j++;
                
                if (a[i] > b[j])
                {
                    min = b[j];
                    
                    
                }
                else if (a[i] < b[j])
                {
                    min = a[i];
                }
                else
                {
                    min = a[i];
                }
            }
            else if (i < a.length)
            {
                i++;
                min = a[i];
                
            }
            else if (j < b.length)
            {
                j++;
                min = b[i];
                
            }
            
            c[k] = min;
        }
        
        return c;
    }
}