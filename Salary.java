
/* Program that calculates salary of employees based on their years of service and department. Created by James Atwood */

import java.util.Scanner;

public class Salary
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       int category;
       double salary;
       double nSales;
       double nYears;    
       int deploy;
       
       /* must be a valid entry otherwise loop continues to ask*/
       do 
       {           
           System.out.println("What category are you? (1=R&D, 2=Sales, 3=Security)");
           category = input.nextInt();      
       }
       while( category != 1 && category != 2 && category != 3 );               //must be a 1, 2, or 3 category
        
       /* after user passes correct category, the category is applied to various cases that handle further prompting*/
       switch (category)
       {
           case 1:                      //case 1 is for the R&D person
                
                salary = 50000;
                do            
                {
                    System.out.println("How many years of service?");
                    nYears = input.nextDouble();                     
                }
                while (!( nYears >= 0) );           //nYears must be greater than or equal to zero
                
                //their salary is also based in part on number of years
                if (nYears >= 20)
                {
                    salary = salary + 12000;
                }
                else if (nYears >= 15)
                {
                    salary = salary + 9000;
                }
                else if (nYears >= 5)
                {                    
                    salary = salary + 3000;
                }
                System.out.println("Salary = $" + salary);
                break;
                
           case 2:                  //case 2 is for the sales person their salary is based, in part, on 1% of sales
           
                salary = 30000;
                do            
                {
                    System.out.println("How much in sales?");
                    nSales = input.nextDouble();                        
                }
                while (!( nSales >= 0) );                           //nSales must be greater than or equal to zero
                salary = salary + (nSales*.01);
                System.out.println("Salary = $" + salary);
                break;
                
           case 3:                  //case 3 is for the security person
                
                salary = 40000;
                do            
                {
                    System.out.println("How many years of service?");
                    nYears = input.nextDouble();                     
                }
                while (!( nYears >= 0) );                           //nYears must be greater than or equal to zero
                
                do                                          //their salary is based, in part, on whether or not they deployed and years of service
                {
                    System.out.println("Deployed for a year? (1=Yes, 0=No)");
                    deploy = input.nextInt();
                    switch (deploy)
                        {
                        case 0:
                            break;
                        case 1:
                            salary = salary + 10000;
                            break;   
                        default: System.out.println("not a valid entry");
                            break;
                        }
                }
                while (!(deploy == 1 || deploy == 0));          //deploy must be a 1 or 0
                
                salary = salary + (nYears*500);
                System.out.println("Salary = $" + salary);                
                break;
           
       }
       
        
        
        
   }          
}
