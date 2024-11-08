
import java.util.Scanner;

public class Q13{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting point ");
        int x = sc.nextInt();

          System.out.println("enter end  point ");
        int y = sc.nextInt();

         int a = x ;
         int sum=0;
if (x>0&&y>0){
         while (a<=y)
         {
            sum = sum+a;

            a++;
         }
         System.out.println("sum of natural no. fram starting to endng point "+sum);
}
else {System.out.println("not in a range of natural no ");}
    }
}