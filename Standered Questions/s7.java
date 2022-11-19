/*If a four digit num is input through the keyboard, WAP to obtain  the sum of the first
and last digit of this number */
import java.util.*;
public class s7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digits num: ");
        int num=sc.nextInt();
        int first=(num/1000)%10;
        int second=(num/100)%10;
        int third=(num/10)%10;
        int fourth=num%10;

        System.out.println("first: "+first+" second: "+second+" third: "+third+" fourth: "+fourth);
        int sum=first+fourth;
        System.out.println("The sum of first and last digits is: "+sum);
    }
}
