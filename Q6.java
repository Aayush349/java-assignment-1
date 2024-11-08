import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
         int x ;
                 Scanner sc = new Scanner(System.in);


        System.out.println("enter a year to check it is a leap yr or not ");
 x= sc.nextInt();
 if(x<4&&x>4){
    System.out.println("invalid input");
 }
    if (x%4==0){
        System.out.println("it is a leap yr ");
    }else {
        System.out.println("not a leap yr "); ;;
    }

    }
}