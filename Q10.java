public class Q10{
    public static void main(String[] args) {
        int n = 10; 
        System.out.printf("Fibonacci Series up ");
        
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            int next = a + b;
            System.out.print("\n" + next);
            a = b;
            b = next;
        }
    }
}