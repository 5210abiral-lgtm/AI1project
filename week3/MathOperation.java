package week3;
import java.util.Scanner;




/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
  
    public static void main (String[]arg)
    {
       Scanner sc = new Scanner(System.in);
        /*System.out.println("What is the value of x");
        int x=sc.nextInt();
        
        System.out.println("What is the value of y");
        int y=sc.nextInt();
        
        int sum=x+y;
        int difference=x-y;
        double division=(x/y);
        int product=x*y;
        
        System.out.println("\nThe sum is :"+sum+ "\n The difference is:"+difference+ "\n The division is:"+division+ "\n The product is :"+product);
        
    System.out.println("What is your score obtained?");
    int A=sc.nextInt();
    String result = (A>40)?"pass":"fail";
    System.out.println(result); */       
        
    
    System.out.println("Enter time in second");
    int S=sc.nextInt();
    
    double M=S/60;
    double H=M/60;
    
    System.out.println("\n Time in minute is " +M+ "\n Time in Hour is " +H);
    
    
    
    
    
        
        
        
        
        
        
    }
    
}