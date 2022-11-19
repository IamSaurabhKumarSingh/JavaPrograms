//18. WAP to print the simple intrest
import java.util.*;
class intrest
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial principle balance");
		float p=sc.nextFloat();
		System.out.println("Enter the annual interest rate");
		float r=sc.nextFloat();
		System.out.println("Enter the time(in years)");
		float t=sc.nextFloat();
		
		float SI= (p*r*t)/100;
		System.out.println("Simple intrest is: "+SI);
		
	}
}