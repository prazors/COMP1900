/*
Description of the Program: This method takes a parameter for the number of minutes parked and returns the appropriate short-term parking charge in dollars.
Author: James Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/11/2013
Lab-num In/Hw: Lab-5 Hw
*/
import java.util.*;
public class ParkingCosts
{
   public static double minutesCharge(int minutes)
   {
       
       double price;
       
       
       if (minutes >= 1440)                      //greater than 24
       {
           price = 21.00;           
       }
       
       else if (minutes >= 420)                 //7 hours or greater
       {
           price = 14;                          //baseline starts at 14 dollars
           minutes = minutes - 420;             //baseline shaves-off the 420 minutes charged at flat rate of 14 dollars
           price = price + (minutes/60);        //1 dollar for each hour
           
           if (minutes % 60 != 0)               //if you go over by 1 minute, then you add a dollar
           {
                price = price + 1.00;
           }
           
        }
        
       else if (minutes >= 60)                  //60 minutes or greater
       {
           price = 2.00;                        //baseline starts at 2 dollars
           minutes = minutes - 60;              //baseline shaves-off the 60 minutes charged at flat rate of 2 dollars
           price = price + (minutes/30);        //ever 30 minutes you are charged an additional dollar
           
           if (minutes % 30 != 0)               //if you go over by 1 minute, then you add a dollar
           {
               price = price + 1.00;
               
           }
                      
       }
            
       else if (minutes > 30)                   //greater than 30 minutes
       {
           price = 2.00;
       }
        
       else                                     //if it's not greater than 30 minutes, parking is free!
       {
            price = 0.00;
       }
               
       return price;                            //the method takes an integer, and returns a double

   }
   
   //this is the test method
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       System.out.println("how many minutes?");
       int minutes = input.nextInt();
       
       System.out.println(minutesCharge(minutes));
   }
}
