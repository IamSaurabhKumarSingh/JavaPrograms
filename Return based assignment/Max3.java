//WAP to return the maximum of three numbers.
import java.util.*;
public class Max3{
    int maxNum(int a, int b, int c){
        int max=0;
        if(a>=b && a>=c){
            max=a;
        }
        else if(b>=a && b>=c){
            max= b;
        }
        else if(c>=a && c>=b){
            max= c;
        }
        return max;
    }
    public static void main(String [] args){
        Max3 obj=new Max3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second num: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third num: ");
        int num3=sc.nextInt();

        int Max=obj.maxNum(num1,num2,num3);
        System.out.println("Maximum of three numbers is: "+Max);
    }
}