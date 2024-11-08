import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 System.out.println("enter a no  ");
int x= sc.nextInt();
      System.out.println("multiplication table upto 10 ");

 for(int i=x; i<=x*10;i+=x)

{   
    System.out.println(i);
   
}
    }
}