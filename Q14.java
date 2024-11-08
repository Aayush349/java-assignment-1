import java.util.Scanner;
public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// program to print multiple of 10
		System.out.println("enter a starting point ");
		int x = sc.nextInt();
		System.out.println("enter a end  point ");
		int y  = sc.nextInt();
		if (y<x+10) {
			System.out.println(" not found any multiple ");
			return ;
		}
		else {
			System.out.println("these are the multiple of 10 between the ginven range ");
			int a =x ;
			while (a<=y)
			{
				if (a%10==0) {

					System.out.println(a);
					a = a+5;
				}
				a++;
			}
		}
	}
}