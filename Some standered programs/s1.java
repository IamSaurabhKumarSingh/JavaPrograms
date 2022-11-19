//WAP to check that a given year is a leap year or not?
import java.util.*;
public class s1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        //leap year if perfectly divisible by 400
        if(year%400==0){
            System.out.println(year+" is a leap year");
        }
        //not a leap year if divisible by 100
        //but not divisible by 400
        else if(year%100==0){
            System.out.println(year+" is not a leap year");
        }
        //leap year if not divisible by 100
        //but divisible by 4
        else if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        //all others are not leap year
        else{
            System.out.println(year+" is not a leap year");
        }
        
    }
}
