//11. WAP to print additon of three long numbers.
import java.util.*;
class num
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first long num");
		long num1=sc.nextLong();
		System.out.println("Enter the second long num");
		long num2=sc.nextLong();
		System.out.println("Enter the third long num");
		long num3=sc.nextLong();
		System.out.println("The addtion of three long num is: "+(num1+num2+num3));
	}
}