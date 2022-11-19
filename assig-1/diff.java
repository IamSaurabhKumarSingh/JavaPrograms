//16. WAP to print diff of square and cube of any num
import java.util.*;
class diff{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int s = num*num;
		int c = num*num*num;
		int diffrence = c-s;
		System.out.println("Square of the num is: "+s);
		System.out.println("Cube of the num is: "+c);
		System.out.println("Diffrence of square and cube is: "+diffrence);
	}
}