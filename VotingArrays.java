/*
Description of the Program: A program that processes a set of ballots by allowing the user to repetitively enter the ID of the selected candidate on each ballot.
Author: James Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 3/23/2013
Lab-num In/Hw: Lab-6 Hw
 */
import java.util.*;

public class VotingArrays
{
    
    public static void main(String args[])
    {

        int voteList[] = new int[1000];                     //new array of length 1000

        int index, numberVotes;                             //initially everyone has number of votes equal to zero
                              
        Scanner input = new Scanner(System.in);
        
        //this is the main loop that asks for a candidate, if a negative value is entered then the loop skips all of the body and terminates.
        do
        {
            System.out.println("enter a candidate ID (0 - 999, enter any negative value to exit): ");
            index = input.nextInt();

            //error checking loop
            while(index > 999)
            {
                System.out.println("Invalid ID number (please enter a value less than 999)");
                index = input.nextInt();
            }
            
            //this conditional assigns the number of votes to an index during one iteration. The variable numberVotes gets recycled after each iteration.
            if (index >= 0)
            {
                numberVotes = voteList[index];                  //numberVotes becomes whatever is in the chosen index
                numberVotes = numberVotes + 1;                  //numberVotes then gets increased by 1
                voteList[index] = numberVotes;                  //the new numberVotes is inserted into the same index

            }

        }
        while (index >= 0);
        
        //print the results heading
        System.out.println("Election Results");
        System.out.println("----------------");
        
        //this loop only prints those who had votes
        for (int i = 0; i < voteList.length; i++)
        {
            if (voteList[i] > 0)
            {                
                System.out.println("Candidate " + i + ": " + voteList[i] + " votes");            
            }

        }
    }
}
