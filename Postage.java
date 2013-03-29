
/*
Description of the Program: A program that prints your name and address as it should appear on a mailing label.
Author: James Atwood    
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/6/2013
Lab-num In/Hw: Lab-5 In
*/
import java.util.*;
public class Postage
{
    public static String formatLines(String a, String b, String c, String d, String e, String f) //this is a general formatting method (it can be re-used)
    {
        String newlines = (a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n");
        return newlines;
    }
    
    //this method uses the formatting method above to print a specific label (mailing label) by reading arguments passed by the user
    public static void main(String[] args)
    {
        String name, business, address, city, state, zip;
        String label;       
    
        Scanner input  = new Scanner(System.in);
       
        //this section gathers all of the necessary variables (note, some can be blank if needed)
        System.out.println("What is the 1st line? (enter to skip)");
        name = input.nextLine();
        
        System.out.println("What is the 2nd line? (enter to skip)");
        business = input.nextLine();
        
        System.out.println("What is the 3rd line? (enter to skip)");
        address = input.nextLine();
        
        System.out.println("What is the 4th line? (enter to skip)");
        city = input.nextLine();
        
        System.out.println("What is the 5th line? (enter to skip)");
        state = input.nextLine();
        
        System.out.println("What is the 6th line? (enter to skip)");
        zip = input.nextLine();
        
        //finally the label is assigned by invoking the formatting method above and passing the arguments to the parameters in the format method
        label = formatLines(name, business, address, city, state, zip);
        
        System.out.println(label);
    }
}
