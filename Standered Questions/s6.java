//If a five digit number is input through the keyboard WAP to calculate the sumof its digit.
import java.util.*;
public class s6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a five digit num: ");
        int num=sc.nextInt();
        int first,second,third,fourth,fifth;
        first = num/10000;
        second = (num/1000)%10;
        third = (num/100)%10;
        fourth = (num/10)%10;
        fifth = num%10;

        int sum = first+second+third+fourth+fifth;
        System.out.println("Sum of its digits is: "+sum);
    }
}
