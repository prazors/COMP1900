
/**
 * Description of the program: Converts kelvin to Celsius and Fahrenheit
 * Author: James Atwood
 * Professor: Dr. Linda Sherrell
 * Instructor: Poonam Dharam
 * Section: 101
 * Date: 1/30/2013
 * Lab-2 In
 * 
 */
public class BritishCoin
{
   public static void main(String[] args)
   {

       
       int pound;
       int shilling;
       int lo;                  //left over
       int pence;
             
       int pence_a = 207;
       int pence_b = 5322;
         
       pound = pence_a/240;     //whole amount of pounds
       lo = pence_a%240;        //left over pence
       shilling = lo/12;        //whole amount of shillings
       pence = lo%12;           //left over pence
             
       
       System.out.println(" pounds "+pound+" shillings "+shilling+" pence "+pence);
       
       pound = pence_b/240;     //whole amount of pounds
       lo = pence_b%240;        //left over pence
       shilling = lo/12;        //whole amount of shillings
       pence = lo%12;
       
       System.out.println(" pounds "+pound+" shillings "+shilling+" pence "+pence);

    }
       
       
}
