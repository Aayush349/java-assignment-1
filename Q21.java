import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = binaryToDecimal(binary);
        System.out.println("Binary " + binary + " is equal to Decimal " + decimal);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " is equal to Binary " + binaryNumber);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
