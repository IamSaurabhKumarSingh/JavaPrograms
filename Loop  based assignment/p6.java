//WAP to print the table of any number using for loop
import java.util.*;
public class p6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int table=0;
        System.out.println("Enter a num to print the table: ");
        int num=sc.nextInt();
        for(int i=1; i<=10; i++){
            table = num*i;
            System.out.println(num+" X "+i+" = "+table);
        }
    }
}
