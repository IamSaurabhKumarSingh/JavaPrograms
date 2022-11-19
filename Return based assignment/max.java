import java.util.*;
public class max {
    int maxNum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static void main(String [] args){
        max obj=new max();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second num: ");
        int num2=sc.nextInt();
        int max=obj.maxNum(num1,num2);
        System.out.println("The maximum of two num is: "+max);
    }
}
