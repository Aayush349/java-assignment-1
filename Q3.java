    import java.util.Scanner;

public class Q3{
    public static void main (String[]args){
Scanner sc =new Scanner(System.in);
int x,y,z;
System.out.println("enter 3 no ");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if (x>y&&x>z) System.out.println("x is largest");
if (y>x&&y>z) System.out.println("x is largest");
else System.out.println("z is largest amog of all ");

    }
}