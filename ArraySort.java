/*
Description of the Program: This program asks the user for 5xn integer array, then produces the unsorted and sorted output
Author: James Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 4/7/2013
Lab-num In/Hw: Lab-8 Hw
*/

import java.util.*;
public class ArraySort
{

	//this method does the actual sorting of columns
	public static void columnSort(int[][] x)
	{

		int i = 0;
		int k = 1;
		int holder;

		//j will dictate the index of each subarray (column)
		for (int j = 0; j < x[i].length; j++)
		{
			i = 0;
			k = 1;

			//this loop will iterate through each row, while keeping the j index the same
			while (k < x.length)
			{
				//this conditional will make the comparison, and then swap k number of times until that column is sorted
				if (x[i][j] > x[k][j])
				{
					//this part does the actual swapping
					holder = x[i][j];
					x[i][j] = x[k][j];
					x[k][j] = holder;

					i = 0;
					k = 1;

				}
				else//if no sorting was needed, we increment the indices
				{
					i++;
					k++;
				}
			}
		}
	}

	//this method will build an array of n length by the user 
	public static  int[][] readArray(int n)
	{

		int yourArray[][] = new int[5][n];
		Scanner input = new Scanner(System.in);
			
		//the row lengths (n) are provided by the user
		//this will prompt for each integer in a given row
		for (int i = 0; i < yourArray.length; i++)
		{
			System.out.println("begin row " + i);

			for (int j = 0; j < n; j++)
			{
				System.out.println("enter a positive integer");
				yourArray[i][j] = input.nextInt();
			}

		}
		return yourArray;
	}

	//test method that prints everything and
	public static void main(String args[])
	{
		int n;
		Scanner input = new Scanner(System.in);

		System.out.println("how many columns?");
		n = input.nextInt();

		//builds the array
		int yourArray[][] = readArray(n);

		//displays the UNSORTED array
		for (int i = 0; i < yourArray.length; i++)
		{
			for (int j = 0; j < yourArray[i].length; j++)
			{

				System.out.print("\t" + yourArray[i][j]);
			}
			System.out.println();
		}

		System.out.println();//make a line that helps distinguish the unsorted array from the sorted one
		System.out.println("----------------------------------------------------------");


		//Sort the array columns
		columnSort(yourArray);

		//display the SORTED array
		for (int i = 0; i < yourArray.length; i++)
		{
			for (int j = 0; j < yourArray[i].length; j++)
			{

				System.out.print("\t" + yourArray[i][j]);
			}
			System.out.println();
		}

	}
}