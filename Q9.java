public class Q9{
    public static void main(String[] args) {
        int num = 12; 
        long factorial = 1;

        for(int i = 1; i <= num; ++i) {
            factorial *= i; 
        }

        System.out.printf("Factorial of %d = %d%n", num, factorial);
    }
}