
/**
 * Write a description of class tableOfNumbersLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableOfNumbersLoop
{
    public static void main(String[] args)
    {
        
        int number = 1;
        int square;
        int cube;
        
        System.out.println("Number\t\tSquare\t\tCube");
        while (number < 10)
        {
            cube = number*number*number;
            square = number*number;
            
            System.out.println(number+"\t\t"+square+"\t\t"+cube);
            number += 1;
        }
        
        
    }
}
