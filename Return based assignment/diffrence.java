//WAP to print diffrence of even or odd of any two numbers
import java.util.*;
public class diffrence {
    String Diff(int a, int b){
        String res="";
        if(a%2==0 && b%2==0){
            res= a+" and "+b+" both the numbers are even ";
        }
        else if(a%2!=0 && b%2!=0){
            res= a+" and "+b+" both num are odd";
        }
        else{
            res= "diffrence of even and odd is: "+(a-b);
        }
        return res;

    }
    public static void main(String [] args){
        diffrence obj=new diffrence();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second num: ");
        int num2=sc.nextInt();
        String D = obj.Diff(num1,num2);
        System.out.println(D);
    }
}
