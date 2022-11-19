//Find the average of five numbers through user input
import java.util.*;
class average{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second num");
		int num2=sc.nextInt();
		
		System.out.println("Enter the third num");
		int num3=sc.nextInt();
		
		System.out.println("Enter the fourth num");
		int num4=sc.nextInt();
		
		System.out.println("Enter the fifth num");
		int num5=sc.nextInt();
		
		int avg;
		avg = (num1+num2+num3+num4+num5)/5;
		
		System.out.println("Average of fifth numbers are:"+(avg));
	}
}