//WAP to print the sum of all elements of int type array.
import java.util.*;
public class a5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the size of the array: ");
        int size=sc.nextInt();
        int sum=0;
        int [] arr=new int[size];
        //Taking the user input.......
        for(int i=0; i<size; i++){
            System.out.println("Enter the vlaue at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the all elements of the array is: "+sum);
    }
}
