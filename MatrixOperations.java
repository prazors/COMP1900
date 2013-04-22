/*
Description of the Program: Program that allows the user to accomplish some matrix arithmetic operations
Author: James Atwood
Professor: Dr. Linda Sherrell
Instructor: Poonam Dharam
Section: 101
Date: 4/19/2013
Lab-num In/Hw: PA3
*/


import java.util.*;
public class MatrixOperations
{
	//this method checks the order of 2 matrices, if they are out of order then return false, else return true 
	public static boolean inOrder(int a[][], int b[][], boolean multiply)
	{
		
		if (multiply)							//this part is activated if you need the matrices to be in order for MULTIPLYING
		{
			if (a[0].length != b.length)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		else									//this part is activated if you need the matrices to be in order for ADDING/SUBTRACTING
		{								
			if (a.length != b.length)											//first check to see if the rows are of the same order
			{
				return false;													//I'll later define false as a trigger for an error
			}

			for (int i = 0; i < a.length; i++)									//next check to see if each column is of the same order
			{
				if (a[i].length != b[i].length)
				{
					return false;
				}
			}
		}
		return true;
	}	



	//this method checks the order of  1 matrix for determinant operations...in this case only 2x2 or 3x3 
	public static boolean inOrder(int a[][], boolean det)
	{
		if (det)								//this part is activated if you need matrix requirements for the DETERMINANT
		{
			if (a.length > 3 || a.length < 2)						
			{
				return false;
			}						
		}	
		return true;
	}	

	


	//prompts user for matrix dimensions and returns the matrix
	public static int[][] promptDimensions()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("how many rows?");
		int row = input.nextInt();

		System.out.println("how many columns");
		int col = input.nextInt();

		int a[][] = new int[row][col];

		return a;
	}




	//prompts for each value in the matrix 
	public static void promptValues(int a[][])
	{
		Scanner input = new Scanner(System.in);
	
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.println("enter a value for row " + (i + 1) + " and column " + (j + 1));
				a[i][j] = input.nextInt();
			}
		
		}		

	}




	//prints a matrix
	public static void print(int a[][])
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}




	//adds 2 matrices together and returns their sum in a new matrix, c
	public static int[][] add(int a[][], int b[][])
	{	
		int c[][] = new int[a.length][a.length];

			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a[i].length; j++)
				{
					c[i][j] = a[i][j] + b[i][j];
				}
			}
		return c;
	}




	//allows for matrix multiplication, and returns the resulting matrix
	public static int[][] multiply(int a[][], int b[][])
	{
		int c[][] = new int[a.length][b[0].length];						//make a new matrix based on dimensions(j,k) of matrices A and B

		//once the last row(k) of matrix B is reached, the loop ends
		for (int k = 0; k < b[0].length; k++)
		{
			//each element, in each row of A is multiplied by each column in B
			for (int j = 0; j < a.length; j++)
			{
				//A's no. of columns must equal B's no. of rows (a[][i], b[i][]) for matrix mulitplication to work
				for (int i = 0; i < a[j].length; i++)
				{
					//note j and k are completely independent indices of their corresponding matrices A and B,
										
					c[j][k] = c[j][k] + a[j][i] * b[i][k];		

					//matrix A and B share a common dimension, i.		

				}
			}
		}
		return c;
	}




	//does scalar mulitplication on a matrix and returns the matrix
	public static int[][] scalarMultiply(int a[][], int value)
	{		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j] = a[i][j] * value;
			}
		}
		return a;
	}



	//only calculates 2x2 and 3x3 determinants
	public static int determinant(int a[][])
	{
		if (a.length == 2)
		{
			return ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));						//2x2 determinant
		}
		else																		//3x3 determinant
		{
			// a 3x3 determinant requires manual creation of mini 2x2 matrices
			int x[][] = {{a[1][1], a[1][2]},
						 {a[2][1], a[2][2]}};

			int y[][] = {{a[1][0], a[1][2]},
						 {a[2][0], a[2][2]}};

			int z[][] = {{a[1][0], a[1][1]},
						 {a[2][0], a[2][1]}};

			//a 3x3 determinant is partly found by 3 smaller 2x2 determinants, and by then multiplying each by proper values
			int i = determinant(y) * a[0][0];						
			int j = determinant(x) * a[0][1];
			int k = determinant(z) * a[0][2];

			return  i - j + k;														//finally add those values together in this order
		}
	}





	//Main Method
	/************************************************************************************************************************/
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int userSelect;

		do
		{	//menu options
			System.out.print( "------ Matrix Operations -------\n\n" +
								"1) Addition\n" +
								"2) Scalar multiplication\n" +
								"3) Multiplication\n" +
								"4) Determinant\n" +
								"5) Exit\n\n" +
								"Please select a choice: ");
			userSelect = input.nextInt();

			switch (userSelect)
			{
				case 5:	//exit the program**********************************************************************************/
				{
					return;
				} 

				case 4: //determinant selection****************************************************************************/
				{
					boolean testDimensions;
					int a[][];

					do
					{
						a = promptDimensions();

						testDimensions = inOrder(a, true);

						if (!testDimensions)
						{
							System.out.println("Only capable of 2x2 or 3x3 matrices");
						}						
					}
					while (!testDimensions);

					promptValues(a);											//prompts for values and store in matrix a;
					System.out.println("The determinant is: " + determinant(a));					//show the determinant
				}
				break;

				case 3:	//multiplication selection**************************************************************************/
				{
					boolean testDimensions;
					int a[][];
					int b[][];

					do
					{
						System.out.println("----------\n" + "Matrix 1\n" + "----------");
						a = promptDimensions();

						System.out.println("----------\n" + "Matrix 2\n" + "----------");
						b = promptDimensions();

						testDimensions = inOrder(a, b, true);

						if (!testDimensions)
						{
							System.out.println("Matrix dimensions are out of bounds");
						}						
					}
					while (!testDimensions);

					System.out.println("----------\n" + "Matrix 1\n" + "----------");
					promptValues(a);

					System.out.println("----------\n" + "Matrix 2\n" + "----------");
					promptValues(b);

					System.out.println("The result is: ");
					print(multiply(a, b));
				}
				break;

				case 2:	/*scalar multiplication selection**********************************************************************/
				{
					boolean testDimensions;
					int a[][];
					int value;

					System.out.println("----------\n" + "Matrix 1\n" + "----------");
					a = promptDimensions();

					System.out.println("----------\n" + "Matrix 1\n" + "----------");
					promptValues(a);

					System.out.println("Enter a value to multiply the matrix by");
					value = input.nextInt();

					System.out.println("The result is: ");
					print(scalarMultiply(a, value));
				}
				break;

				case 1:	//addition selection***********************************************************************************/
				{
					boolean testDimensions;
					int a[][];
					int b[][];

					do
					{
						System.out.println("----------\n" + "Matrix 1\n" + "----------");
						a = promptDimensions();

						System.out.println("----------\n" + "Matrix 2\n" + "----------");
						b = promptDimensions();

						testDimensions = inOrder(a, b, false);

						if (!testDimensions)
						{
							System.out.println("Matrix dimensions are out of bounds");
						}						
					}
					while (!testDimensions);

					System.out.println("----------\n" + "Matrix 1\n" + "----------");
					promptValues(a);

					System.out.println("----------\n" + "Matrix 2\n" + "----------");
					promptValues(b);

					System.out.println("The result is: \n-----------");
					print((add(a, b)));
				}
				break;
				default: System.out.print("\n\t **Selection not recognized**\n\n");
			}
		}
		while (userSelect != 5);
	}






}