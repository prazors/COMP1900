
/**
*Description of the Program: MarketProgram
*Author: James Atwood
*Professor: Dr. Linda Sherrell
*Instructor: Poonam Dharam
*Section: 101
*Date: 02-11-2013
*Group Assignment: Ch4 number 8
**/

import java.util.*;

public class MarketPrice
{
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double fruitPricePerPound;
        double pounds;
        double price = 0;
        
        System.out.println("What is the price per pound?");
        fruitPricePerPound = keyin.nextDouble();
        
        System.out.println("What is the total pounds?");
        pounds = keyin.nextDouble();
        
        if (pounds > 6)             //if greater than 6 pounds, you get a 30% discount
        {
            price = (fruitPricePerPound*pounds) - ((fruitPricePerPound*pounds)*0.30);
            
        }
        
        if (pounds > 3 ) //if greater than 3 but less than 6 pounds, you get 10% discount
        {
            price = (fruitPricePerPound*pounds) - ((fruitPricePerPound*pounds)*0.10);
        }
        else if( pounds <= 6)                           //anything less, no discount
        {
        price = (fruitPricePerPound*pounds);
        }
        
        price = (int)((price + .005)*100); //rounding nearest penny algorithm
        price = (double)(price/100);        //rounding nearest penny algorithm
        
        System.out.println("Total price is: " + price);
    }
    
}
