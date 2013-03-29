
/*
*Description of the Program: Counts total number of pins in the alien bowling scheme
*Author: James Atwood
*Professor: Dr. Linda Sherrell
*Instructor: Poonam Dharam
*Section: 101
*Date: 02-20-2013
*Lab-num In/Hw: Lab-4 In
*/
public class BowlingPins
{
    public static void main(String[] args)
    {
        int pins = 1;                   //we start with 1 pin
        int row = 1;                    //and that pin is on row 1
        int total = 1;                  //therefore, we have 1 total pin
        
        while (row < 4)                                  //while the row count is less than 999
        {
            pins = pins + 2;                                //the first row already had 1, so it's okay to begin incrementing with 2 pins
            row += 1;                                       //increment the row for the next iteration
            total = total + pins;                           //the total is equal to the total + the number of pins for that row
        }
        
        
        System.out.println(total);
    }
}
