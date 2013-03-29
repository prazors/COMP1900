
/*
*Description of the Program: Guessing game: Computer generates a hidden random number that the user has 5 chances to guess to win.
*Author: James Atwood
*Professor: Dr. Linda Sherrell
*Instructor: Poonam Dharam
*Section: 101
*Date: 02-20-2013
*Lab-num In/Hw: Lab-4 In
*/
import java.util.*;
public class GuessingGame
{
    public static void main(String[] args)
    {
        int random = (int)(100*Math.random() + 1);
        int userGuess;
        int tries = 0;
        int gameContinue = 1;
        Scanner keyboard = new Scanner(System.in);
        
        
        
    while (gameContinue != 2)                       //the default value is 1 (continue yes)
    {
        while (tries < 5)                           //while the user has tries remaining do the following
        {
            System.out.println("I am thinking of a number between 1 and 100, inclusive. Enter your guess: ");
            userGuess = keyboard.nextInt();
            while (userGuess > 100 || userGuess < 1)                //the very first while statement once game begins, checks for errors
            {
                System.out.println("Please enter a number between 1 and 100"); 
                userGuess = keyboard.nextInt();
            }
            if (userGuess > random && tries < 5)                //if too high and user has tries remaining do this
            {
                tries += 1;
                System.out.println("Too high, try again. You have " +(5-tries)+ " guesses remaining");                
            }
            
            if (userGuess < random && tries < 5)                //if too low and user has tries remaining do this
            {
                tries += 1;
                System.out.println("Too low, try again. You have " +(5-tries)+ " guesses remaining");               
            }
                        
            if (userGuess == random)                            //if user acually guesses the number, he wins and break out of game loop
            {
                System.out.println("*You guessed correctly! You Win.*");
                break;
            }
            else if (tries == 5)
            {
                System.out.println("the number was " + random);         //if user fails to guess within 5 tries then break out of loop
                break;
            }
        }
        System.out.println("Would you like to play again (1=yes, 2=no?)");              //game loop option: 1 continues, 2 exits the loop
        gameContinue = keyboard.nextInt();
        
        
    }
    System.out.println("thanks for playing");
}
}
