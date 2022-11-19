//WAP to call by value.
import java.util.*;
public class s12 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        s12 obj=new s12();
        System.out.println("Enter a num into n: ");
        int num=sc.nextInt();
        obj.fun(num); //calling fun funtion while passing value.

    }
    void fun(int num){
       System.out.println("Num is: "+num);
    }
}

