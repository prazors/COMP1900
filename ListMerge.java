
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
        int count = 0, k = 0;
        int temp;
        
        //this loop will first count the number of matching IDs
        for(int i = 0; i < a.length; i++)                           //first got to the value of the first array
        {
                     
            for(int j = 0; j < b.length; j++)                       //then compare it to each value of the next array
            {
                if(a[i] < b[j])                                    //if there is a match, count it
                {
                   
                }
            }           
            
        }
        
        int c[] = new int[count];                                   //make a third array whose size is based on the count above
        
        //this loop will then assign those matched IDs to the third array (c), in a similar fashion to the loop above
        for(int i = 0; i < a.length; i++)
        {            
            temp = a[i];
            
            for(int j = 0; j < b.length; j++)
            {
                
                if(temp == b[j])
                {                                       
                    c[k] = temp;                                    //assigns a the value from temp to the index of the new array
                    k++;
                }
            }
            
        }
        
        //Prints the number of common friends and their IDs
        System.out.println("you have " + count + " friends in common");
        System.out.print("their IDs are ");
        
        for(int i = 0; i < c.length; i++)
        {
            System.out.print(" " + c[i] + ",");
        }
        System.out.println();                                       //we need this to start a new line for any repeated runs of the code
        
        
    }
}
