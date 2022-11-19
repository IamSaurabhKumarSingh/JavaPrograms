import java.util.*;
public class Sum{


    int returnSum(int a, int b)
    {
        int joint = a+b;
        return joint;

    }
    public static void main(String [] args){
        Sum obj=new Sum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second num: ");
        int num2=sc.nextInt();
        int add=obj.returnSum(num1,num2);
        System.out.println("The sum of num1+num2 is: "+add);
    }
}