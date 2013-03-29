/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mee
 */
import java.util.*;

public class GovOT 
{
    public static void main(String[] args)
    {
     int grade = 2;
     int step = 1;
     double pay = 0;
     Scanner keyin = new Scanner(System.in);
     
     
     System.out.println("What is your grade?");
     grade = keyin.nextInt();
     System.out.println("What is your step?");
     step = keyin.nextInt();
     
     switch(grade)
     {
         case 1:                //the list of pay rates(steps) for grade 1
             switch(step)
             {
                 case 1: pay = 15.27;
                     break;
                 case 2: pay = 15.78;
                     break;
                 case 3: pay = 16.28;
                     break;
                 case 4: pay = 16.79;
                     break;
                 case 5: pay = 17.30;
                     break;
                 default: System.out.println("step not found");
             }             
             break;
             
        case 2:                 //the list of pay rates(steps) for grade 2
             switch (step)      
             {
                 case 1: pay = 17.16;
                     break;
                 case 2: pay = 17.57;
                     break;
                 case 3: pay = 18.14;
                     break;
                 case 4: pay = 18.62;
                     break;
                 case 5: pay = 18.83;
                     break;   
                 default: System.out.println("step not found");                     
             }            
             break;
            
        case 3:                 //the list of pay rates(steps) for grade 3
            switch (step)
            {
                case 1: pay = 18.72;
                    break;
                case 2: pay = 19.35;
                    break;
                case 3: pay = 19.98;
                    break;
                case 4: pay = 20.60;
                    break;
                case 5: pay = 21.23;
                    break;      
                default: System.out.println("step not found");
                    
            }
            break;
            default: System.out.println("grade not found");
            
         
         
         
     }
     System.out.println("your rate of pay is : $" +pay);
    }
}
