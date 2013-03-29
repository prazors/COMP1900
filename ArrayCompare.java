/*
Description of the Program: A program that allows you to input a list of friend IDs and compare's it to another list of IDs, and determines
                            how many friends that they have in common.
Author: James Atwood and Bryan Smith
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/27/2013
Lab-num In/Hw: Lab-7 In
 */
import java.util.*;
public class ArrayCompare
{
    //this method will read a list of friend IDs and then store them in an array
    public static int[] readFriendIDs()
    {
        Scanner input = new Scanner(System.in);       
        
        System.out.println("how big of a list?");
        int length = input.nextInt();                       //length is determined by the user
        
        int arrayIDs[] = new int[length];                   //then the length defines the size of the array
        
        int i = 0;
        
        //this loop will run each time asking for an ID
        do
        {
            System.out.println("enter an ID");
            arrayIDs[i] = input.nextInt();            
            i++;
        }
        while( i < length);
        
        return arrayIDs;

    }
    
    public static void displayCommonFriendIDs(int[] a, int[] b)
    {
        int count = 0, k = 0;
        int temp;
        
        //this loop will first count the number of matching IDs
        for(int i = 0; i < a.length; i++)                           //first got to the value of the first array
        {
                     
            for(int j = 0; j < b.length; j++)                       //then compare it to each value of the next array
            {
                if(a[i] == b[j])                                    //if there is a match, count it
                {
                    count = count + 1;
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
    
    //test method
    public static void main(String[] args)
    {
        
        int a[] = readFriendIDs();                                  //assigns the 1st friend list to array a[]
        int b[] = readFriendIDs();                                  //assigns the 2nd friend list to array b[]
        
        displayCommonFriendIDs(a, b);                               //processes the matches
        
    }
}
