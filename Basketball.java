/*
Description of the Program: Methods that return various game stats and scores for a given array of basketball data.
Author: James (Lee) Atwood and Bryan Smith
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 4/3/2013
Lab-num In/Hw: Lab 8 In
*/


import java.util.*;
public class Basketball
{

    //return the average points per game of player p
    public static double averagePPG(int[][] scores, int p)
    {
              
       int row = p; 
       double total = 0; 
      
       //the column index changes, but the row index stays the same
       for(int col = 0; col < scores[row].length; col++)
       {
           total = total + scores[row][col];           
       }
       
       double average = (total / scores[row].length);               //average the total for that row (player)
       return average;
       
    }
        
    
    //returns the total points scored by the entire team in game, g
    public static int singleGameScore(int[][] scores, int g)
    {
                
        int row = 0;
        int total = 0;                  //total points scored in a given game
        
        //the row index changes, and the column index stays the same
        while (row < scores.length)
        {
            total = total + scores[row][g];
            
            row++;
        }
        
        return total;
        
    }
    
    //returns the average points scored by the entire team, per game
    public static double averageGameScore(int[][] scores)
    {
                    
        int row = 0, col = 0;
        int gametotal = 0, total = 0;                           //total points scored in a given game and final total
        
        while( col < scores[0].length)                          //while there are still columns remaining
        {
            
           while ( row < scores.length)                         //total up the rows for that column
           {
                gametotal = gametotal + scores[row][col];
                row++;
           }
            total = total + gametotal;
            gametotal = 0;
            row = 0;
            col++;         
            
        }
        
        total = (total / (scores[0].length));                   //compute the average
        
        return total;
        
    }
    
    //returns the index of the highest-scoring player in a given column (game)
    public static int singleGameTopScoringPlayer(int[][] scores, int g)
    {
               
        int index = 0;
        int row = 0;
        int max = scores[row][g];                                   //by default we assign the max value as the first value
        int nextrow = row + 1;
        
           while ( nextrow < scores.length)                         //total up the rows for that column
           {
               //compare if the max value is smaller than its successive value
               if (max < scores[nextrow][g])
               {
                   max = scores[nextrow][g];                    //if it is larger, then it becomes the new max value
                   index = nextrow;                             //save the index in the variable called index
               }
               
               nextrow++;
           }
            
           return index;
            
    }
    
   
    //test method. This also holds the array of points
    public static void main(String args[])
    {
        
        int s[][] =  {{20, 27, 16, 23, 20, 27, 18}, {8, 18, 14, 17, 9, 12, 0}, {38, 19, 25, 22, 19, 25, 31}, 
                        {17, 8, 11, 21, 15, 0, 9}, {2, 1, 3, 0, 10, 2, 4}};
        
        int i = 0;   
        while (i < s.length)
        {
            
            for (int j = 0; j < s[i].length; j++)
            {
                System.out.print(s[i][j] + "\t");
                
            }
            System.out.println();
            i++;            
        }
        
        System.out.println(averagePPG(s, 2));
        System.out.println(singleGameScore(s, 0));
        System.out.println(averageGameScore(s));
        System.out.println(singleGameTopScoringPlayer(s, 2));
        
        
        
    }
}
