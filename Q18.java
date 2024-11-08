import java.util.Scanner;
    
public class Q18{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to count digit");
int x =  sc.nextInt();
int n=x;
int count = 0;
while(n>0)
{
    count++;
    n=n/10;

}
System.out.println("no. of digit in "+x+" is " +count);

    }
    
}