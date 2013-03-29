
/*The program prompts user for classes and grades to computer GPA. Written by James Atwood*/

import java.util.Scanner;
public class GradePtAvgCalc
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       int addGrade;
       int creditHrs;
       int totalHrs = 0;
       double nGrade;           //actually number grade
       int  pGrade;             //grade points (i.e. 1, 2, 3 or 4)
       double qPoints = 0;      
       double gpa;
       
       do                                   //the main do-while loop continues looping (to add more classes) until user enters 0, to exit
       {
           
           do                                       //ask user to enter credit hours for a class
           {
               System.out.println("enter the number of credit hours for your class");
               creditHrs = input.nextInt();
           }
           while (!(creditHrs >= 0));                //continues until the user enters something greater or equal to zero
                      
           do                                       //ask user to enter numeric grade for the class
           {
               System.out.println("enter the numeric grade for that class (i.e. 90, 75, 83, etc.");
               nGrade = input.nextDouble();
                          
           }
           while (!(nGrade >= 0));                //continues until the user enters something greater or equal to zero
           
           /* this section assigns points(integers) to the variable pGrade, based on grade provided by user*/
           if (nGrade >= 90)
                    {
                        pGrade = 4;
                    }
               else if (nGrade >= 80)
                    {
                        pGrade = 3;
                    }
               else if (nGrade >= 70)
                    {
                        pGrade = 2;
                    }
               else if (nGrade >= 60)
                    {
                        pGrade = 1;
                    }
               else
                    {
                        pGrade = 0;
                    }
           totalHrs = totalHrs + creditHrs;                 //compute total hrs thus far         
           qPoints = qPoints + (pGrade*creditHrs);          //compute total qPoints thus far
           
           do
           {
                System.out.println("add another class? (1=Yes, 0=No)");
                addGrade = input.nextInt();
           }
           while (!(addGrade == 1 || addGrade == 0));       //make user enter a 1 or zero
           
        }
        while (addGrade != 0);                              //continue adding grades while addGrade != 0
        
        gpa = qPoints/totalHrs;                             //compute gpa
        
        System.out.println("your GPA is: " + gpa);          //prints msg if you made dean's list
        if (gpa >= 3.5)
        {
            System.out.println("you made the Dean's list");
        }
             
   }
}
