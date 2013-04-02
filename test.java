
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
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
    public static int returnArray()
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
                    incr += 1;
                    place = true;
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
            
            for(int n = 0; n < a.length; n++)
            {
                System.out.print("\t" + a[n]);
                
            }
            
            System.out.println();
            System.out.println(20 - incr);
            System.out.println(incr);
            return count;
}
}
