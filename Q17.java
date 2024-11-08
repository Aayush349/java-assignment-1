import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = findLCM(num1, num2);

        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }
}
