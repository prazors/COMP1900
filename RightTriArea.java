
/**
 * Write a description of class test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class RightTriArea
{
    public static double triangleArea(double base, double height)
    {
        return .5 * base * height;        
    }
    
    public static void main(String[] args)
    {
        double width, height;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("how many triangles?");
        int noOfTriangles = input.nextInt();
        
        
       
        
        while (noOfTriangles > 0)
        {
            System.out.println("what is the height?");
            height = input.nextDouble();
            System.out.println("what is the width?");
            width = input.nextDouble();
            
            double area = triangleArea(width, height);
        
            System.out.println(area);
            
            noOfTriangles -= 1;
        }
    }
}


