//WAP to find area of circle,rectangle and square using switch case.
import java.util.*;
public class s3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("::::::::YOUR OPTIONS ARE:::::::::");
        System.out.println("1. Area of circle");
        System.out.println("2. Area of rectangle");
        System.out.println("3. Area of square");
        System.out.println("Enter the choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1: 
                System.out.println("Enter the radius: ");
                float r=sc.nextFloat();
                double c=3.15*r*r;
                System.out.println("Area of circle is: "+c);
                break;
            case 2:
                System.out.println("Width: ");
                float w=sc.nextFloat();
                System.out.println("Enter the length: ");
                float l=sc.nextFloat();
                double rectangle=w*l;
                System.out.println("Area of rectangle is: "+rectangle);
                break;
            case 3: 
                System.out.println("Enter the side: ");
                float s=sc.nextFloat();
                double asquare=s*s;
                System.out.println("Area of square is: "+asquare);
                break;
            default:
                System.out.println("Please enter the right choice ");
        }
    }
}
