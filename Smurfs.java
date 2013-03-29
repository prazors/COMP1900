
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
public class Smurfs
{
    
        public static void main(String[] args)
        {
            int jan, feb, mar, apr;
            jan = 621;
            feb = 482;
            mar = 506;
            apr = 802;
            
            boolean f, m, a; //true false variable each month
            int feb_ch, mar_ch, apr_ch; //change in month
            
            
            feb_ch = feb - jan;
            mar_ch = mar - feb;
            apr_ch = apr - mar;
            
            f = (jan < feb);
            m = (feb < mar);
            a = (mar < apr);
            
            
            System.out.println("Month\tIncrease?\tAmount");
            System.out.println("______________________");
            System.out.println("Feb\t"+f+"\t\t"+ feb_ch);
            System.out.println("Mar\t"+m+"\t\t"+mar_ch);
            System.out.println("Apr\t"+a+"\t\t"+apr_ch);
        }
            
}
