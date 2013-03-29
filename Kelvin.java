
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
public class Kelvin
{
    public static void main(String[] args)
    {
        int kelvin;
        double fahren; // using double for decimal precision
        double celsius;
        
        kelvin = 309; 
        celsius = (309 - 273.15);
        fahren = ((9/5)*celsius)+32; //normal division is used because of type double
        
        System.out.println("the temp in Celsius is " + celsius);
        System.out.println("the temp in Fahrenheit is " + fahren);
    }
        
}
