/*WAP to print the grade of students if, num is more than 70 grade-A, 
more than 60 grade-B and if less than 60 grade-C
*/
import java.util.*;
public class N2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=sc.nextInt();
        if(marks>=70){
            System.out.println("Grade-A");
        }
        else if(marks>=60){
            System.out.println("Grade-B");
        }
        else{
            System.out.println("Grade-C");
        }
    }
}
