
/**
 * Write a description of class RollDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class RollDice
{
    public static void main(String[] args)
    {
        int diceValue = 8;
        switch (diceValue)
        {
        // 7 or 11 is a win
        case 7:
        case 11: System.out.println("You rolled " + diceValue + " you win!");
        break;
        //2, 3, or 12 is a loss
        case 2:
        case 3:
        case 12: System.out.println("You rolled "+ diceValue + " you lose!");
        break;
        // 4, 5, 6, 8, 9, or 10 is the "point"
        default: System.out.println("You rolled " + diceValue+ "that's your point!");
        }
    }
}
