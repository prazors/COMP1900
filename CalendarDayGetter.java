
/**
 * Write a description of class CalendarDayGetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarDayGetter
{
    public static void main(String[] args)
    {
        int dow = 3;            //day of week
        int dom;                //day of month
        int month = 13;          //month (starting with 3 = Mar, 4 = Apr, 5 = May,...Feb = 14)
        int yoc = 13;            //year of century
        int century = 21;        // century
        
        
        dom = (((13*month+1)/5) - yoc - (yoc/4) - (century/4) - (5*century) + dow)%7;
        
        System.out.println(dom);
        
    }
}
