import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60934;

        System.out.println(miles + "  == " + kilometers + " kilometers.");
    }
}