import java.util.Scanner;

public class Q26 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Q26(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + value);
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
            System.out.println("Inserted " + value + " into the queue.");
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return -1;
        } else {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        Q26 queue = new Q26(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to insert: ");
                    int value = scanner.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    int removedValue = queue.remove();
                    if (removedValue != -1) {
                        System.out.println("Removed " + removedValue + " from the queue.");
                    }
                    break;
                case 3:
                    int peekValue = queue.peekFront();
                    if (peekValue != -1) {
                        System.out.println("Front value is " + peekValue);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
