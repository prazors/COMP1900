/*
Description of the Program:
Author: James Atwood, Chas Syndegaard, Bryan Smith, Kyle Pruitt
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 4/7/2013
Lab-num In/Hw: Group Assignment Ch 7, No. 11
*/
import java.util.*;
public class ListMerge
{
    

    public static int[] listMerge(int[] a, int[] b)
    {
        int i = 0, j = 0, size = 0;
        int min = a[i];
        
        size = (a.length + b.length); //this sets the length for array c by adding a's length and b's length
        
        int c[] = new int[size];
        //this section does the comparison of the sorted lists and merges the values array c
        for (int k = 0; k < c.length; k++)
        {
            
            //as long as the last element hasn't been exceeded for either list
            if (i < a.length && j < b.length)
            {
                //make a comparison of the min
                if (a[i] < b[j])
                {
                    min = a[i];
                    i++;
                }
                else
                {
                    min = b[j];
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
        Scanner input = new Scanner(System.in);
        
        
        int mergeContinue = 0;
        




        while (mergeContinue != -999)
        {
            int a[], b[];
            int n, m;

            //get 1st list from user
            System.out.println("how large is your 1st list?");
            n = input.nextInt();
            a = new int[n];

            for (int i = 0; i < n; i++)
            {
                System.out.println("enter an integer");
                a[i] = input.nextInt();
            }

            //get 2nd list from the user
            System.out.println("how large is your 2nd list?");
            n = input.nextInt();
            b = new int[n];

            for (int i = 0; i < n; i++)
            {
                System.out.println("enter an integer");
                b[i] = input.nextInt();
            }

            //sort the arrays
            intArraySort(a);
            intArraySort(b);



            //merge the two lists and store in array c
            int c[] = listMerge(a, b);
        
            int[] d[] = {a, b, c};
            char mychar = 'a';

            //print the output of the lists
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

            

                System.out.println("continue? type 0 for yes, or -999 for no");
                mergeContinue = input.nextInt();

               

            
            
            

        }
               
        
        
        
        
        
    }
}