//WAP to print the greatest among three numbers.
import java.util.*;
public class N3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a=sc.nextInt();
        System.out.println("Enter the second num: ");
        int b=sc.nextInt();
        System.out.println("Enter the third num: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" this num is the greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" this num is the greatest");
        }
        else{
            System.out.println(c+" this num is the greatest");
        }
    }
}