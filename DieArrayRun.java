
/**
 * Write a description of class DieArrayRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class DieArrayRun
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
    
    //this method handles the printing of the results
    public static void printResults()
    {
        Scanner input = new Scanner(System.in);
        
      
        int rolls, value;
        boolean mark = false;
        //Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of rolls");
        rolls = input.nextInt();
                
        
        int list[] = rollDieList(rolls);
        int slist[] = new int[rolls - 1];                   //cloned array. This will hold only the *successive* values or n - 1 values
        
        //this section assigns the values of 1st array to the cloned array, and trims off the first value
        int j = 0;
        for (int i = 1; i < rolls; i++)                 
        {
            slist[j] = list[i];
            j = j + 1;
        }
        
        j = 0;                                              //reset j to zero
        
        //this section will run through the 1st array and look at the successive values from the cloned array, and make the comparisons
        for (int i = 0; i < rolls; i++)
        {
            //this section checks to make sure that the end of the cloned array hasn't been reached; if so we don't increment its index
            //it also assign the successive value to the variable called "value"
            if((j + 1) < rolls)
            {
                value = slist[j];
                j = j + 1;                
            }
            else
            {
                value = j;
            }
            
            
            //if the first value matches the successive value then prepare for it to be marked
            if (list[i] == value)
            {                
                //if the number isn't marked for grouping
                if (mark == false)
                {
                    System.out.print("(" + list[i] + " ");
                    mark = true;
                }
                else
                {
                    System.out.print(list[i] + " ");                    
                }
                
            }
            
            //it must now be a different succesive number
            else
            {
                //if the number is marked for grouping
                if (mark == true)
                {
                    System.out.print(list[i] + ") ");
                    mark = false;
                }
                else
                {
                    System.out.print(list[i] + " ");
                }                
               
            }
                   
        }
        System.out.println();
        
    

    }
    
    //test method
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int next = 0;
        do
        {
            printResults();
            System.out.println("continue?  -1 for no");
            next = input.nextInt();
        }
        while( next != -1);
    
    
    }
    
}
    
