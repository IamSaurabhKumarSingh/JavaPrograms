//WAP to return min of two numbers.
import java.util.*;
public class min {
    int minNum(int a, int b){
        if(a<b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String [] args){
        min obj=new min();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second num: ");
        int num2=sc.nextInt();
        int Min = obj.minNum(num1, num2);
        System.out.println("Minimum of two num is: "+Min);
    }
}
