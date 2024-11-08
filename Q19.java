import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to check pallindrome ");
        int x = sc.nextInt();
        int n=x;
        int b;
        int c=0;
        //reversed no.
        while(n>0)
        {
           b=n%10 ;
           c=c*10+b;
           n=n/10 ;   
        }
        if(x==c){
        System.out.println("given no.is pallindrome");
        }
        else
        {
         System.out.println("no.  is not pallindrome "+c);

        }
       
    }
}