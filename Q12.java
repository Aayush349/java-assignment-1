import java.util.Scanner;
 class student {
    int maths ,physics,chemistry;
    void data() 
    {
                Scanner sc = new Scanner(System.in);

        System.out.println("enter no of maths  ");
        maths =sc.nextInt();

 System.out.println("enter no of physics ");
        physics =sc.nextInt();

 System.out.println("enter no of chemistry  ");
        chemistry  =sc.nextInt();

    }

 void checkdata(int a ,int b, int c)
 {

if(a>=60&&b>=50&&c>=40 &&a+b+c>=200||a+b>150 )

{
     System.out.println("yes credential is true ");

}
  else
  { System.out.println("no following credential is not true ");

}

}
};
public class Q12{
    public static void main(String[] args) {
 
  student a1 = new student();
  a1.data();
a1.checkdata(a1.maths,a1.physics,a1.chemistry );


    }
}
