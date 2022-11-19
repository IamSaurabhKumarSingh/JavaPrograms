//WAP to print sum of area of circle and circum of circle
import java.util.*;
class sum{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		float r=sc.nextFloat();
		double area=(3.14*r*r);
		System.out.println("Area of circle is: "+area);
		
		System.out.println("Enter the radius: ");
		float radius=sc.nextFloat();
		double circum=(2*3.14*r);
		System.out.println("Circum of circle is: "+circum);
		
		double add = area+circum;
		System.out.println("Sum of area of circle and circum of circle is: "+add);
	}
}