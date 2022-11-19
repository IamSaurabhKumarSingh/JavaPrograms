//WAP to print diffrence of area of circle and area of rectangle.
import java.util.*;
class diff
{
	public static void main(String [] args)
	{
		//float rectangle, circle;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of circle");
		float r=sc.nextFloat();
		double circle = (3.14*r*r);
		System.out.println("Area  of circle is: "+circle);
		
		//now code of area of rectangle
		
		System.out.println("Enter the area of length");
		int length=sc.nextInt();
		System.out.println("Enter the area of width");
		int width=sc.nextInt();
		float rectangle = (length*width);
		System.out.println("Area of rectangle is: "+rectangle);
		
		//now finding the diffrence between area of circle and rectangle
		double diffrence = circle-rectangle;
		System.out.println("The diffrence between area of circle and rectangle is: "+diffrence);
	}
}