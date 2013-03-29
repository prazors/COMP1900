
/*
Description of the Program: Predicts the month of February's weekday pattern, based on where the 1st day of January begins (provided by user).
Author: James Atwood    
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 2/25/2013
Lab-num In/Hw: Lab-4 Hw
*/
import java.util.Scanner;

public class FebruaryPredictor
{
    public static void main(String[] args)
    {
        int wdayCounter;                //counts the number of days in a week
        int mdayCounter = 0;            //counts the number of days in a month
        int fdayBegin = 0;              //the beginning day for February
        int initPrintTabCount = 1;      //initial Print tab count;
        
        Scanner input = new Scanner(System.in);
        do                                      //this is the initial error checking for proper week day input
        {
            System.out.println("Choose a day for the 1st of January: (0 = Sun, 1 = Mon, 2 = Tue, etc.)");
            wdayCounter = input.nextInt();
        }
        while (wdayCounter > 6 || wdayCounter < 0);
        
        /** This section calculates the month of January pattern **/
        
        while (mdayCounter < 31)            //if you haven't reached the 31st of January, do the following
        {
           
           if (wdayCounter < 6)             //if you still have more days left that week increment the weekday by 1 and the month day by 1
           {
               wdayCounter += 1;
               mdayCounter += 1;
               fdayBegin = wdayCounter;     //set the new weekday to wdayCounter
           }
           else                             //if you don't have any more days remaining in the week, reset the counter to zero, increment the month day by 1
           {
               wdayCounter = 0;
               mdayCounter += 1;
               fdayBegin = wdayCounter;     //set the new weekday to wdayCounter
           }
            
        }
               
        System.out.println();                       //extra line for spacing
        
        /** This section calculates and PRINTS the month of February's pattern **/
        
        mdayCounter = 1;                //reset month day-counter to 1
        wdayCounter = fdayBegin;        //the end of January is the beginning of February
              
        System.out.println("February Pattern is as follows:");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        
        /*the initial week line for february needs to be tabbed based on the 1st day of that week. The code below 
        adds the proper number of tabs necessary for the first week*/
        while (initPrintTabCount <= wdayCounter)
        {
            System.out.print("\t");
            initPrintTabCount +=1;
        }
       System.out.print(mdayCounter);           //prints the 1st of the month on that same line
        
        
        /* now we have to print the remaining weeks starting with day 2, if there are no week days remaining that week
        then a new line is printed*/
        while (mdayCounter < 28)            
        {
           
           if (wdayCounter < 6)             //if you still have more days left that week increment the weekday by 1 and the month day by 1
           {
               
               wdayCounter += 1;
               mdayCounter += 1;
               System.out.print("\t" + mdayCounter);            //print a tab and the new day of month
               
           }
           else                             //if you don't have any more days remaining in the week, reset the wdayCounter to zero, increment the month day by 1
           {
               System.out.println();
               wdayCounter = 0;
               mdayCounter += 1;
               System.out.print(mdayCounter);                   //new week beginning, so print the day of month...no tabs
           }
            
        }
    }
}
