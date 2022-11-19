//WAP to print Bharat if number is greater than 100
import java.util.*;
class Bharat
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		if(num>100)
		{
			System.out.println("Bharat");
		}
		else{
			System.out.println("Exit");
		}
	}
}