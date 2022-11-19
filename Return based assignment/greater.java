//WAP to check that the num which is greater than 50 is even or odd.
import java.util.*;
public class greater{
    String check(int n){
        if(n>50){
            if(n%2==0)
                return n+" is even";
            else
                return n+" is odd";
        }
        else
        {

            return n+" less than 50";
       
        }
    }
    public static void main(String [] args){
        greater obj=new greater();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num=sc.nextInt();
    
      String res=obj.check(num);

         System.out.println(res);
       }
}