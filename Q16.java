import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = HCF(num1, num2);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
    }

    public static int HCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return HCF(b, a % b);
    }
}
