/*
Description of the Program: A method that accepts a price in dollars and returns a new price rounded to the nearest dollar, after increasing/decreasing 
                            price by increase percent.
                            
Author: James (Lee) Atwood and Kenny Diep
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/7/2013
Lab-num In/Hw: Group assignment page 230, number 6
*/
import java.util.*;
public class PriceAdjustment
{
    public static int bumpMe(int price, int increase, boolean updown)
    {
        //converting the int variables (price and increase) to double
        double percentD = increase/100.0;                           //convert increase to a decimal percentage
        double priceD = price;                                      //convert price to price decimal
        
        if (updown)             
        {
            priceD = priceD + (priceD * percentD);                   //increasing newPrice by new percentage           
        }
        
        else
        {
            priceD = priceD - (priceD * percentD);                  //decreasing newPrice by new percentage
        }
        
        price = (int)priceD;                               //trim the decimal price to nearest dollar (rounding down or up is irrelevant AFTER percentage is applied)
        
        return price;                                               
        
    }
    
    public static void main(String[] args)
    {
        int price, increase;
        boolean updown;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a price (no decimals)");
        price = input.nextInt();
        
        System.out.println("enter the amount to increase/decrease (enter percentage as a whole number)");
        increase = input.nextInt();
        
        System.out.println("increase or decrease? false = decrease, true = increase");
        updown = input.nextBoolean();
        
        System.out.println(bumpMe(price, increase, updown));        
    }
    
}
