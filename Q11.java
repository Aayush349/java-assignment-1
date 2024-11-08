import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        System.out.println("enter a no  to reverse ");
        Scanner sc = new Scanner(System.in) ;
        int x= sc.nextInt();
        int a ;
        while (x>0)
        {
            a=x%10;
            System.out.print(a);
            x=x/10;
        }


    }
}