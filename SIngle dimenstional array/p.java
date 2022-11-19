
import java.util.*;
public class p {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();

         int i;
        for(i=2;i<num;i++)
        {
          if(num%i==0)
          {

               System.out.println(num+" is not prime");
               break;
          }

        }
        if(num==i)
        {
            System.out.println(num+" is prime");

        }

    }
}
