//sum of three numbers using user input
import java.util.*;
class hello
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st num\n");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd num\n");
		int num2=sc.nextInt();
		
		System.out.println("Enter the 3rd num\n");
		int num3=sc.nextInt();
		
		//System.out.println("sum of three num are: "+(num1+num2+num3));
		System.out.println(num1+num2+num3);
	}
}