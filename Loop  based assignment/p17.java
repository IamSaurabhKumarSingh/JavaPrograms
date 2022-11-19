//WAP to print the factorial of any num using while loop
import java.util.*;
public class p17 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("The factorial of "+num+" is: "+fact);
    }
}
