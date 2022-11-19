/*Ramesh basic slary is input through the keyboard his dearness allowance is 40% of 
basic salary and house rent allowance is 20% of basic salary, WAP to calculate his 
gross salary.
*/
import java.util.*;
public class s1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ramesh's basic salary: ");
        int salary=sc.nextInt();
        float da = (salary*40)/100;
        float ha = (salary*20)/100;
        float gs = salary+da+ha;
        System.out.println("da is: "+da);
        System.out.println("ha is: "+ha);
        System.out.println("Ramesh's gross salary is: "+gs);
    }
}