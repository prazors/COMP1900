
/**
 * Write a description of class FeetToMeters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FeetToMeters
{
    public static void main(String[] args)
    {
        double feet = 3;
        double meters;
        
        
        while (feet < 30)
        {
            meters = feet*3.28;
            System.out.println(feet+"feet is approximately "+meters+" meters.");
            feet += 3;
            
        }
    }
}
