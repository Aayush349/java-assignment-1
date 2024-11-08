import java.util.Scanner;

public class  Q7 {
    public static void main (String[]args ){
      
        
System.out.println("enter your grades ");
Scanner sc = new Scanner(System.in); 

    System.out.println("enter your marks \n");
        System.out.println("maths \n");
            int maths = sc.nextInt();
            if (maths>100||maths<0)
            {
                System.out.println("invalid innput");
                 return ;
            }
           System.out.println("english \n");
            int english = sc.nextInt();
             if (english>100||english<0)
            {
                System.out.println("invalid innput");
                 return ;
            }
                System.out.println("science \n");
                int science=sc.nextInt();
                 if (science >100||science<0)
            {
                System.out.println("invalid innput");
                 return ;
            }
  System.out.println("so_science \n");
                int so_science=sc.nextInt();
                 if (so_science>100||so_science<0)
            {
                System.out.println("invalid innput");
                 return ;
            }

  System.out.println("hindi \n");
                int hindi=sc.nextInt();
 if (hindi>100||hindi <0)
            {
                System.out.println("invalid innput");
                 return ;
            }
int total = maths +science+so_science+english+hindi;
System.out.println("total marks is "+total);
if (total >=450 )System.out.println("a grade ");
else{
    if (total >400&&total <450)System.out.println("b grade ");
else{
    
       if (total >350&&total <400)System.out.println("c grade ");
else{  
     if (total <300)System.out.println("d grade ");

    

}
}
}
System.out.println("percentage is "+total/5);
}}




    
