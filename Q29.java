import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Duplicate elements and their frequency of occurrence:");
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("Element: " + array[i] + ", Frequency: " + count);
                }
            }
        }
    }
}
