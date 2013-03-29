
/**
 * Write a description of class BankAccountLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class BankAccountLoop
{
   public static void main(String[] args)
   {
       
       double withdrawals = 0, deposits = 0;
       double total = 10.0;
       final int SENT = 0;
       
       Scanner keyboard = new Scanner(System.in);
       
       while (total != SENT)
       {
           System.out.println("enter a deposit");
           deposits = deposits + keyboard.nextDouble();
           System.out.println("enter a withdrawal");
           withdrawals = withdrawals + keyboard.nextDouble();
           total = withdrawals + deposits;
           
           
        }
       
       
   }
    
}
