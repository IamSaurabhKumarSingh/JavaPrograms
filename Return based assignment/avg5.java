//WAP to return the average of five numbers.
import java.util.*;

public class avg5 {
        int avgNum(int a, int b, int c, int d, int e){
            return (a+b+c+d+e)/5;
        }
    public static void main(String [] args){
        avg5 obj=new avg5();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st num: ");
        int num1=sc.nextInt();
        System.out.println("Etner the 2nd num: ");
        int num2=sc.nextInt();
        System.out.println("Enter the 3rd num: ");
        int num3=sc.nextInt();
        System.out.println("Enter the 4rth num: ");
        int num4=sc.nextInt();
        System.out.println("Enter the 5th num: ");
        int num5=sc.nextInt();
        
        int avg=obj.avgNum(num1,num2,num3,num4,num5);
        System.out.println("The average of five numbers is: "+avg);
    }
}
