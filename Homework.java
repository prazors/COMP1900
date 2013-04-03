/**
 * Need help getting an array to realize it has duplicates and store those away. Edit if needed. comments also helpful.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homework
{
   public static void main(String args[])
    {
        int a[]=new int[20]; //first list of numbers
        int b[]= new int[20]; //second list
        int k[]=new int[20]; //merged list (haven't sorted just yet just trying to get to work right at the moment).
        int c; //random number list
        int i, j; //array variables
        int counter=20; //gives a stoping point for the loops.
        int counter1=0, counter2=0, counter3=0; //backup counters(if needed)
        for(i = 0; i < counter; i++)// sets first array
        {
           c=(int)(20*Math.random());
           a[i]=c;
        }
        
        for(j=0; j<counter; j++) //sets second array
        {
           c=(int)(20*Math.random());
           b[j]=c;
        }
        
         for(int f = 0; i < a.length; f++) //sets merged array
        {
                
                if(a[i] < b[j]) //case 1: a<b
                {
                    k[i]=b[i];
                    j++;
                }
                if(a[i]>b[j]) //case 2: a>b
                {
                    k[i]=a[i];
                    j++;
                }
                if(a[i]==b[j]) //case 3: a=b
                {
                    k[i]=a[i];
                    j++;
                }
            
        }
        
        
    }
}
