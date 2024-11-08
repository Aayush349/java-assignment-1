
import java.util.Scanner;

public class Q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter a no  to check prime or not ");
       int x=  sc.nextInt();
       
       int n=2;
       while(n<x) 
       {
        if(x%n==0)
        {
            System.out.println(+x +" is not a  prime no ");
        break;
        }
        else{
        
        n++;
       }

       }
               if(x%n!=0)System.out.println("it is a prime no");

    }
}