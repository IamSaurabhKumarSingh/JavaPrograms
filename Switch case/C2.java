/*WAP to print the area of cirlce on ch-1, circum of circle on ch-2 and area of triangle
    on ch-3 */
    import java.util.*;
public class C2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for area of circle: ");
        System.out.println("Enter 2 for circum of circle: ");
        System.out.println("Enter 3 for area of triangle: ");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the radius: ");
                float r=sc.nextFloat();
                double A = 2*3.14*r*r;
                System.out.println("Area of circle is: "+A);
                break;
            case 2:
                System.out.println("Enter the radius: ");
                float r1=sc.nextFloat();
                double c= 2*3.14*r1;
                System.out.println("Circum of circle is: "+c);
                break;
            case 3: 
                System.out.println("Enter the base: ");
                float b=sc.nextFloat();
                System.out.println("Enter the height: ");
                float h=sc.nextFloat();
                float t = (b*h)/2;
                System.out.println("Area of triangle is: "+t);
                break;
            default:
                System.out.println("Please enter the right choice: ");
        }

    }
}
