//WAP to print Bharat if num is greater than 50 and less than 100 print India if number is greater than 100.
import java.util.*;
class print{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		if(num>50 && num<100)
		{
			System.out.println("Bharat");
		}
		else if(num>100)
		{
			System.out.println("India");
		}
		else{
			System.out.println("enter the right num to print India or Bharat");
		}	
	}
}