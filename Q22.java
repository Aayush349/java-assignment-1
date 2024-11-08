import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int a = 0; a < n; a++) {
            System.out.println("Enter element " + (a + 1) + ": ");
            x[a] = sc.nextInt();
        }

        // Sort the array manually
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        double median;
        if (n % 2 == 0) {
            median = (x[n / 2 - 1] + x[n / 2]) / 2.0;
        } else {
            median = x[n / 2];
        }

        System.out.println("The median is " + median);
    }
}
