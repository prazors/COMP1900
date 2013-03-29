
/*
*Description of the Program: Keeps track of the complex scoring procedures of a mini game of bowling
*Author: Caleb and James (Lee) Atwood
*Professor: Dr. Linda Sherrell
*Instructor: Poonam Dharam
*Section: 101
*Date: 2/18/2013
*Programming Assignment 1
*/
import java.util.Scanner;
public class BowlingScoreKeeper
{
    public static void main(String[] args)
    {
        /**note, all of these variables MUST be initialized in order to prevent a compile error**/
        
        int frame = 1;                //starting the frame counter at 1, instead of 0, just for simplicity
        int roll = 0;              //adds pins from user input
        int score = 0;          //keeps track of score in each frame
        int count = 0;       //this is a counter of the iterations for each frame
        int bcount = 0;   //this is a counter of the iterations of each bonus frame
        int broll = 0; //adds bonus roll pins from user input
        int totalScore = 0;
        Scanner keyboard = new Scanner(System.in); //gonna call my user input variable "keyboard"
        
        while (frame < 6)                                       //a mini game is 5 frames, since I start the counter at 1, I stop after the 5th iteration
        {
            System.out.println("Frame: " +  frame);
            while (count < 2)                               //you only get two rolls per frame!!!! (unless it's a bonus)
            {
                System.out.println("how many pins?");
                roll = roll + keyboard.nextInt();
                
                if (roll == 10)                 //enter the bonus roll if you *ever* roll 10 in the same frame
                {
                     System.out.println("Bonus frame");
                     while (bcount < 3)                             //this determines whether you get 2 or 1 bonus roll, based on
                     {
                         System.out.println("how many pins?");
                         broll = broll + keyboard.nextInt();
                         
                         bcount += 2;    
                         
                     }
                     broll = broll + roll;                          //adds the sum of the bonus roll(s) to the main roll
                     roll = 0;
                     bcount = 0;
                     count += 2;            
                }
                if (roll < 10)                  //you can still enter the bonus roll if the sum of 2 rolls equals 10
                {                    
                    count += 1;
                    bcount += 2;
                }
                if (roll > 10)
                {
                    System.out.println("not a valid number of pins");           //if user inputs something larger than 10 in a roll
                    return;
                }
                score = roll + broll;               //add the score of the main roll plus any bonus roles into a variable called score, which represents a frame score
                broll = 0;
            }
            System.out.println("Frame " + frame + " totalscore: " + score);         //this prints the total frame score after each frame is complete
            bcount = 0;
            totalScore = totalScore + score;
            frame += 1;
            count = 0;                                              //after each frame iteration, I need to reset these variables to zero
            roll = 0;                                               //after each frame iteration, I need to reset these variables to zero
            broll = 0;                                              //after each frame iteration, I need to reset these variables to zero
            
        
    }
    System.out.println("GrandTotal: " + totalScore);                //after all frame iterations are complete, it prints the grand total for the game
}
}
