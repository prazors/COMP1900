
/**
*Description of the Program: Days In the Month
*Author: James Atwood
*Professor: Dr. Linda Sherrell
*Instructor: Poonam Dharam
*Section: 101
*Date: 02-18-2013
*Lab-num In/Hw: Lab-3 Hw
**/
import java.util.*;

public class DaysinMonth
{
    public static void main(String[] args)
    {
        int noOfDays = 30;
        int month;
       
        String monthName = null;
        Scanner keyin = new Scanner(System.in);
        
        System.out.println("Enter a month (1 for Jan, 2 for Feb, etc.)");
        month = keyin.nextInt();
        
        switch (month)
        {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: System.out.println("This month does not exist"); return; //if the chosen month isn't one of the case statements, do this
            
                
       
        }
        
        /* odd numbered months between Jan and Aug have alternating odd for 31-day, even for 30-day months*/
        // if the month is ODD AND less than August, do this
        if ((month%2 != 0 && month%2 != 5) && month < 8)        
        {            
            System.out.println("The month of " + monthName + " has " + (noOfDays + 1) + " days.");
        }
        //or else, if the month is EVEN, AND less than August, AND not equal to February, do this
        else if ((month%2 == 0 || month%2 == 5) && (month < 8) && month != 2)    
        {
            System.out.println("The month of " + monthName + " has " + noOfDays + " days.");
        }
        //if the month is February, do the following
        else if (month == 2)                            
        {
            System.out.println("There are 28 or 29 days in the month of " + monthName );
        }

        /* even numbered months between Aug and Dec have alternating even for 31-day, odd for 30-day months*/       
        // if the month is ODD and greater than or equal to August, do this
        if ((month%2 != 0 && month%2 != 5) && month >= 8)                     
        {
            System.out.println("The month of " + monthName + " has " + noOfDays + " days.");
        }
        // if the month is EVEN  and greater than or equal to August, do this
        else if ((month%2 == 0 || month%2 == 5) && month >= 8)              
        {
            System.out.println("The month of " + monthName + " has " + (noOfDays + 1) + " days.");
        }      
        
    }
}
