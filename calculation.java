//WAP to print the product of cube and square of any num
import java.util.*;
class calculation
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num: ");
		int num2=sc.nextInt();
		System.out.println("Enter the 3rd num: ");
		int num3=sc.nextInt();
		
		double cube=(num1*num2*num3);
		System.out.println("Cube is: "+cube);
		
		System.out.println("Enter the 1st num: ");
		int num_1=sc.nextInt();
		System.out.println("Enter the 2nd num: ");
		int num_2=sc.nextInt();
		
		double square=(num_1*num_2);
		System.out.println("Square is: "+square);
		
		double product = cube*square;
		System.out.println("product of cube and  square is: "+product);
		
	}
}