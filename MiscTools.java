
/**
 * Write a description of class Tests here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MiscTools
{
    //shows how to implement min and max using only loops and branching...also gives the user the ability to continue or break-out of program.
    public static void minMaxExample()
    {       
        int b;
        int cont = 1;
        int sum = 0;
        int min, max;
        int count;
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a value");
        b = input.nextInt();
        min = b;
        max = b;
        count =1;
        sum = b;
        do
        {
            System.out.println("continue? -1 for no, 1 for yes");
            cont = input.nextInt();
            
            if (cont != -1)
            {
                System.out.println("enter a value");
                b = input.nextInt();
                 if (b > max)
                        {
                            max = b;
                        }
                        else if ( b < min)
                        {
                            min = b;
                        }
                        count += 1;
                        sum = sum + b;                        
            }
                               
        }
        while ( cont != -1 );
                
        System.out.println("the max is " + max);
        System.out.println("the min is " + min);
        System.out.println("the average is " + (sum/count));   
 
    }
    
    //tests if the the provided int is odd, if odd then it returns a boolean true, and if even returns boolean false
    public static boolean isOdd(int i)
    {
        if (i % 2 != 0 )
        {        
            return true;
        }
        else return false;
    }
    
    //tests if the the provided int array is odd, if odd then it returns a boolean true, and if even returns boolean false
    public static boolean isOdd(int[] a)
    {
        int len = 0;
        for (int i = 0; i < a.length; i++)
        {
            len += 1;
            
        }
        
        if (len % 2 != 0)
        {
            return true;
        }
        else return false;
    }
    
    //tests if the the provided int array is odd, if odd then it returns a boolean true, and if even returns boolean false
    public static boolean isOdd(int[][] a)
    {
        int len = 0;
        for (int i = 0; i < a.length; i++)
        {
            len += 1;
            
        }
        
        if (len % 2 != 0)
        {
            return true;
        }
        else return false;
    }
    
    //produces factorial results, works for both negative and positive integers only
    public static int factorial(int num)
    {
        int result = 1;
        
        if (num >= 1)
        {
            
            for(int i = 0; num > i; i++)
            {
                result = result * (num - i);           
            }
        }
        else if (num < 0)
        {
            num = num * -1;
            for(int i = 0; num > i; i++)
            {
                result = result * (num - i);           
            }
            result = result * -1;
            
        }
        else
        {
            return 1;
        }
        
        return result;    
    }
    
    
    
    //only works for positive integers. finds factorial using recursion
    public static int recursiveFactorial(int num)
    {
        if (num == 0)
        {
            return 1;
        }
        else
        {
            return num * recursiveFactorial(num - 1);
        }       
    }
    
    //returns the nth fibonnacci number (skipping the 1st one and zero) using a recursive call
    public static int recursiveFibonnacci(int num)
    {
        if (num == 0 || num == 1)
        {
            return 1;
        }
        else
        {
            return recursiveFibonnacci(num - 1) + recursiveFibonnacci(num - 2);
        }
        
        
        
    }
    
    //Requires int. Counts down and then up, using recursive call, then prints the output in terminal.
    public static void countDownOrUp(int num)
    {
        
        
        if (num != 0)
        {
            System.out.println(num);
            countDownOrUp(num - 1);           
        }
        
        System.out.println( num);   
        
    }
    
    public static void main2(String[] args)
    {
        //variables DECLARED within the for loop cannot be accessed outside the loop; however, any variable declared in method body is available to all statements inside.
        
        // you cannot redeclare a variable name inside the loop if it's already declared in the body of the method.
        int i = 17; //if you comment this out, you will get an error
        
        
        for (i = 1; i < 10; i++)
        {
            int w = 1;
            System.out.println(i);   
            
        }
        
        System.out.println(i);
        //System.out.println(w);//if you uncomment this, you will get an error
    }
    
    //stores some string stuff in an array, then prints it
    public static void arrayTest()
    {
        Scanner input = new Scanner(System.in);
        
        String stuff[] = new String[5];
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("store somethin'");
            stuff[i] = input.next();
        }
        
        System.out.println();
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println(stuff[i]);
        }
        
    }
    
    //method prompts for 10 integers and displays those same numbers in reverse order.
    public static void reverseIntegers()
    {
        Scanner input = new Scanner(System.in);
        int myArray[] = new int[10];
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println("enter an integer for slot " + i );
            myArray[i] = input.nextInt();            
        }
        
        System.out.println();
        
        for (int i = 9; i >= 0; i--)
        {
            System.out.print(myArray[i] + "\t");
        }
        
        
    }
    
    
    
    public static int[] raggedArray()
    {
        int a[] = {1, 2, 3, 4, 5};
        
        return a;
        
        
        
        
    }
    
    public static void main(String args[])
    {
        int num[] = raggedArray();
        boolean res;
        Scanner input = new Scanner(System.in);
//         System.out.println("enter a number");
//         num = input.nextInt();
        
        res = isOdd(num);
        
        System.out.println(res);
        
}
}
