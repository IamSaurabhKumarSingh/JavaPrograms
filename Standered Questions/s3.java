/*IF the marks obtained by a student in five diffrent subjects are input through the 
keyboard , find out the agreegate marks and percentage marks obtained by the students 
assume that the maximum marks that can be obtained by a student in each subject is 100*/
import java.util.*;
public class s3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of a student::::");
        System.out.print("Hindi -> ");
        float h=sc.nextFloat();
        System.out.print("\nEnglish -> ");
        float e=sc.nextFloat();
        System.out.print("\nComputer -> ");
        float c=sc.nextFloat();
        System.out.print("\nMath -> ");
        float m=sc.nextFloat();
        System.out.print("\nScience -> ");
        float s=sc.nextFloat();
        float a=h+e+c+m+s;
        float p=(a*100)/500;
        System.out.println("Agreegate marks is: "+a);
        System.out.println("Percentage is: "+p);
    }
}