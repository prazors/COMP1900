
/*
Description of the Program: Creates an amortization schedule based on parameters provided from user
Author: James (Lee) Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date:20130303
Lab-num In/Hw: Programming assignment 2
*/
import java.util.Scanner;
public class LoanInterest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int calContinue = 1;
        
        double amtBorrowed;         //initial amount borrowed
        double monthlyPmt;          //the initial amount to pay each month
        
        double rate;                //interest rate
        double term;                //term (in months) to pay off the loan
        double numer;               //value of the numerator for the payment algorithm
        double denom;               //value of the denominator for the payment algorithm
        
        double intePart;            //part of payment going toward interest
        double prinPart;            //part of payment going toward principal
        double totalInterest = 0;   //cumulative interest paid over duration of loan
        
        while (calContinue != 0)
        {
            System.out.println("How much will you borrow (in dollars)?");        //get the borrowed amount
            amtBorrowed = input.nextDouble();            

            /*this section checks the input parameters for the borrowed amount*/
            while (amtBorrowed < 1 || amtBorrowed > 1000000)                               
            {          
                if (amtBorrowed < 1)                                        //if it's a negative value, then print a msg
                {
                    System.out.println("please enter a positive value of 1 or greater");
                    amtBorrowed = input.nextDouble();
                }
                
                if (amtBorrowed > 1000000)                                  //if it's a value greater than 1,000,000, then print a msg
                {
                    System.out.println("please enter a value less than 1,000,000");
                    amtBorrowed = input.nextDouble();
                }                                
            }
                        
            System.out.println("What is the interest rate? (choose between .5 and 15 percent. Format: 5.7 = 5.7%, 3.1 = 3.1%)"); //get the interest rate
            rate = input.nextDouble();
            
            /*this section checks input parameters for interest rate*/
            while (rate < 0.5 || rate > 15)
            {
                if (rate < 0.5)
                {
                    System.out.println("Please enter a positive value");
                    rate = input.nextDouble();        
                }
            
                if (rate > 15)
                {
                    System.out.println("Please enter a value that is 15 or less");
                    rate = input.nextDouble();
                }
            }
                        
            System.out.println("What is the loan term in months?");             //get the loan term, in months
            System.out.println("(Enter a value in months, from 1 to 360)");
            term = input.nextDouble();
            
            /*this section checks the input parameters for the term of the loan*/
            while (term < 0 || term > 360)
            {
                if (term < 0)
                {
                    System.out.println("Please enter a positive value that is 360 or less");
                    term = input.nextDouble();
                }
                
                if (term > 360)
                {
                    System.out.println("Please enter a positive value that is 360 or less");
                    term = input.nextDouble();
                }             
            }
            
            rate = (rate/100)/12;               //convert yearly rate to the proper rate in months
            numer = (rate*amtBorrowed);         //numerator value
            denom = (1/(1 + rate));             //denominator initial value
                        
            for (term = term; term > 1; term--)                     //for-loops are in chapter 5; this calculates the denominator value
            {
                denom = denom*(1/(1 + rate));
            }
            
            monthlyPmt = numer/(1-denom);                           //calculates the initial monthly payment
                        
            monthlyPmt = (int)((monthlyPmt + .005) * 100);        //rounding algorithm
            monthlyPmt = (int)monthlyPmt;
            monthlyPmt = (double)monthlyPmt;
            monthlyPmt = monthlyPmt/100;
            
            //this section prints out the amortization schedule and makes things look prettier
            System.out.println("Monthly Payment\t\tPrincipal\t\tInterest\t\tBalance Remaining");
            
            while (amtBorrowed > 1)                                         //while the remaining balance greater than 1 dollar (stop loop when nearest dollar < 1)
            {
                intePart = rate * amtBorrowed;                          //the portion each month paid towards interest is rate times the remaining balance
                prinPart = monthlyPmt - intePart;                       //the portion going towards Principal is the Monthly payment minus  the interestPart 
                amtBorrowed = amtBorrowed - prinPart;                   //now, the amount borrowed becomes the amount borrowed minus the principle portion paid
                totalInterest = totalInterest + intePart;               //cumulative interest
                
                intePart = (int)((intePart + .005) * 100);    //rounding algorithm
                intePart = (int)intePart;
                intePart = (double)intePart;
                intePart = intePart/100;
                
                prinPart = (int)((prinPart + .005) * 100);    //rounding algorithm
                prinPart = (int)prinPart;
                prinPart = (double)prinPart;
                prinPart = prinPart/100;
                
                amtBorrowed = (int)((amtBorrowed + .005) * 100);  //rounding algorithm
                amtBorrowed = (int)amtBorrowed;
                amtBorrowed = (double)amtBorrowed;
                amtBorrowed = amtBorrowed/100;
                
                System.out.println(monthlyPmt + "\t\t\t" + prinPart + "\t\t\t" + intePart + "\t\t\t" + amtBorrowed);
                
            }
            
            totalInterest = (int)((totalInterest + .005) * 100);    //rounding algorithm
            totalInterest = (int)totalInterest;
            totalInterest = (double)totalInterest;
            totalInterest = totalInterest/100;
            
            System.out.println();
            System.out.println("Total interest owed: " + totalInterest);
                       
            do                          //get user value to continue or stop the main loop
            {
                System.out.println("Would like to calculate another loan? (1=Yes, 0=No)");
                calContinue = input.nextInt();               
            }
            while ((calContinue != 1 && calContinue != 0));
                        
        }
        
        System.out.println("stop");
        
    }
}
