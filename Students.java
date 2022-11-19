//WAP to take input of five students int strig and print them on the output screen.
import java.util.*;
class students{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String name1=sc.nextLine();
		System.out.println("Enter the second name");
		String name2=sc.nextLine();
		System.out.println("Enter the third name");
		String name3=sc.nextLine();
		System.out.println("Enter the fourth name");
		String name4=sc.nextLine();
		System.out.println("Enter the fifth name");
		String name5=sc.nextLine();
		
		
		System.out.println("The name of the first student is: "+name1);
		System.out.println("The name of the second student is: "+name2);
		System.out.println("The name of the third student is: "+name3);
		System.out.println("The name of the fourth student is: "+name4);
		System.out.println("The name of the fifth student is: "+name5);
	}
}