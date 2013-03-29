/**
*Description of the Program:
*Author: James Atwood
*Professor: Dr. Linda Sherrell
*Instructor: Poonam Dharam
*Section: 101
*Date: 02-05-2013
*Lab-num In/Hw: Lab-2 Hw
**/
import java.util.*;
public class WallArea
{
   public static void main(String[] args)
   {
       double wall1;
       double wall2;
       
       double door;
       double window;
       
       double totalarea;
       
       
       Scanner userinput = new Scanner(System.in);
       
       //calculates wall1 area
       System.out.println("What is the width of 1st wall?");
       wall1 = userinput.nextDouble();
       System.out.println("What is the height of the 1st wall?");
       wall1 = wall1*userinput.nextDouble();
       
       //calculates wall2 area
       System.out.println("What is the width of 2nd wall?");
       wall2 = userinput.nextDouble();
       System.out.println("What is the height of the 2nd wall?");
       wall2 = wall2*userinput.nextDouble();
       
       //calculates door area
       System.out.println("What is the width of the door?");
       door = userinput.nextDouble();
       System.out.println("What is the height of the door?");
       door = door*userinput.nextDouble();
       
       //calculates window area
       System.out.println("What is the width of the window?");
       window = userinput.nextDouble();
       System.out.println("What is the height of the window?");
       window = window*userinput.nextDouble();
       
       totalarea = (2*wall1)+(2*wall2)-(door)-(window);
       totalarea = (int)((totalarea+.005)*100);             //rounding nearest hundredth algorithm
       totalarea = (double)(totalarea)/100;                 //rounding nearest hundredth algorithm
       
       System.out.println("The paintable wall area is "+ totalarea +" ft squared");
       
   }
    
}
