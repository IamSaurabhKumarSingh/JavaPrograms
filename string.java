//WAP to print your full name using user input
import java.util.*;
class PrintFullName{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name: ");
		String str=sc.nextLine();
		System.out.println("Your name is: "+str);
	}
}