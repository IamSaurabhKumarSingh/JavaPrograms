//WAP to print even or odd of any num
import java.util.*;
class num{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println(num+" is an even num");
		}
		else{
			System.out.println(num+" is an odd num");
		}
	}
}