import java.util.Scanner;

/**
 * Write a description of class question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question1
{
    public static void main(String[]arg)
    {
        /*String name="Abiral Adhikari";
        System.out.println("My name is");
        System.out.println("Abiral Adhikari");
        
        int a=10;
        int b=10;
        System.out.println(++a);
        System.out.println(a++);
        
        
        String Name = "Abiral Adhikari";
        int Age=19;
        double GPA=3.68;
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(GPA);*/
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Water Level");
        int waterlevel=sc.nextInt();
        System.out.println("Current water level="+waterlevel+"L");
        String message=(waterlevel>=1000)? "Warning: Water level is 1000L or more" : "Status Normal";
        System.out.println(message);
        
        

        
        
        
        
        
    
        
    }
    
    
    


    
}