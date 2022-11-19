//WAP to print the smallest among three numbers.
import java.util.*;
public class N4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a=sc.nextInt();
        System.out.println("Enter the second num: ");
        int b=sc.nextInt();
        System.out.println("Enter the third num: ");
        int c=sc.nextInt();

        if(a<b && a<c){
            System.out.println(a+" is the smalles num");
        }
        else if(b<a && b<c){
            System.out.println(b+" is the smallest num");
        }
        else{
            System.out.println(c+" is the samlles num ");
        }
    }
}
