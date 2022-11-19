//25.WAP to print average of two float num
import java.util.*;
class avg
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num");
		float num1=sc.nextFloat();
		System.out.println("Enter the second num");
		float num2=sc.nextFloat();
		float avg = (num1+num2)/2;
		System.out.println("Average of two float num is: "+avg);
		
	}
}