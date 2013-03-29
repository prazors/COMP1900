/*
Description of the Program: A program that prints a paycheck                            
Author: James (Lee) Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/20/2013
Lab-num In/Hw: Lab 6 In
*/
import java.util.*;
public class PayChecks
{
    /* converts a number to its English teen name*/
    public static String teenName(int number)
    {
       
        switch(number)
        {
          
            case 10 : return "ten";
            case 11 : return "eleven";
            case 12 : return "twleve";
            case 13 : return "thirteen";
            case 14 : return "fourteen";
            case 15 : return "fifteen";
            case 16 : return "sixteen";
            case 17 : return "seventeen";
            case 18 : return "eighteen";
            case 19 : return "ninteen";
            default : return "";
        }
    } 
    
    /*converts a number to its English tens name*/
    public static String tensName(int number)
    {
        if(number>=90) return "ninety";
        if(number>=80) return "eighty";
        if(number>=70) return "seventy";
        if(number>=60) return "sixty";
        if(number>=50) return "fifty";
        if(number>=40) return "forty";
        if(number>=30) return "thirty";
        if(number>=20) return "twenty";
        return "";
    }
    
    /*converts a digit (1 - 9) to the corresponding string*/
    public static String digitName(int number)
    {
        switch (number)
        {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        } 
    }
    
    /* takes an hourly rate and the number of hours worked as parameters returning the amount an employee should be paid*/
    public static double getPaid(double rate, double hours)
    {
        if (hours > 40)
        {
            rate = rate + (rate / 2);
        }
               
        return (rate * hours);    
    }
    
    /* turns a number into its English name*/
    public static String nameConverter(double numberD)
    {
        double pennies = numberD - (int)numberD;            //this section takes the cents from the dollar amount
        int cents = (int)(pennies*100);
        int number = (int)(numberD);                        //this section convers the dollar amount
        
        String name;
        
        if ((number / 100) > 0)                             //if the number is greater than 100, it needs to print "hundred"
        {
             name =  digitName((number / 100)) + " hundred";    //print "hundred" after integer divsion (which gives you the beginning integer)
             number = number % 100;                             //now, get the remaining digits and assign it to number
             
             if ((number >= 10) && (number < 20))               //if it's a teen number, then do the following
             {
                name = name + " " + teenName(number); 
             }
             else                                               //if it's not a teen number, then use tensName and digitName for the rest of the naming
             {
                 name = name + " " + tensName((number));
                 number = number % 10;
                 name = name + " " + digitName(number);
             }
             
        }        
        
        else if ((number >= 10) && (number < 20))           //if the number is a teen
        {
            name = teenName(number);                        //then name will be a teen name            
        }
        else                                                //if the number isn't a teen or a hundred, then use tensName and digitName
        {
            name = tensName((number));
            number = number % 10;
            name = name + " " + digitName(number);            
        }        
        return name + " " + (cents) + "/100";
    }
    
    //this method prints the paycheck using the rate and hours parameter

    public static void printPaycheck(double rate, double hours)
    {
        double payAmount = getPaid(rate, hours);
        String payAmountEnglish = nameConverter(payAmount);
        
        
        System.out.println("\t\t\tDate\t\tAmount");
        System.out.println("\t\t\t" + "3/31/13" + "\t\t" + payAmount);
        System.out.println();
        System.out.println("PAY");
        System.out.println(payAmountEnglish + " DOLLARS");
        System.out.println();
        System.out.println("TO THE ORDER OF:");
        System.out.println("\t\tJohn Doe");
        System.out.println("\t\t1009 Franklin Blvd.");
        System.out.println("\t\tSunnyvale, CA 95014");
        
        
        
    }
    
    //test method...//
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double rate, hours;       
        String date;
        
        
        System.out.println("enter a rate of pay");
        rate = input.nextDouble();
        
        System.out.println("enter number of hours");
        hours = input.nextDouble();
        
       
        
        
        printPaycheck(rate, hours);

    
        
        
    
    
    }
}
    




  
  
    

