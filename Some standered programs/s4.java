//WAP to check whether a given number is prime or not.
import java.util.*;
public class s4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num=sc.nextInt();
        int i;
        for(i=2; i<num; i++){
            if(num%i==0){
                System.out.println(num+" is not prime");
                break;
            }
        }
        if(num==i){
            System.out.println(num+" is prime");
        }
    }
}
