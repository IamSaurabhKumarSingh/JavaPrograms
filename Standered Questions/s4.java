/*The length and breadth of a rectangle and radius of a circle are input through the keyboard
write a program to calculate the area and perimeter of the rectangle and the area and circumfrence
of the circle.
*/
import java.util.*;
public class s4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        float l=sc.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        float b=sc.nextFloat();
        System.out.println("Enter the radius of a circle: ");
        float r=sc.nextFloat();
        float a=l*b;
        System.out.println("The area of rectangle is: "+a);
        float p=2*(l+b);
        System.out.println("The parimeter of rectangle is: "+p);
        double area=3.14*r*r;
        System.out.println("The area of circle is: "+area);
        double c=2*3.14*r;
        System.out.println("Circumfrece of circle is: "+c);
    }
}
