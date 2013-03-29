
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
public class Books
{
    public static void main(String[] args)
    {
        int books = 5;
        double bookcost = 19.95;
        double tax = .075;
        double shipping =2.00;
        double total = ((bookcost*books)*1.075)+(books*shipping);
        
        System.out.println("No. of Books: " +books);
        System.out.println("x cost per book: " +bookcost);
        System.out.println("___________________________");
        System.out.println((bookcost*books));
        System.out.println("tax: " + tax);
        System.out.println("___________________________");
        System.out.println("sub total: "+(bookcost*books)*1.075);
        System.out.println("___________________________");
        System.out.println("Total: " +total);
    }
      
}
