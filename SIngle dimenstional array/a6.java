//WAP to print the sum of long array
import java.util.*;
public class a6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        long sum=0;
        long [] arr=new long[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter element of the array at index num: "+i);
            arr[i] = sc.nextLong();
        }
        for(int i=0; i<size; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the long array is: "+sum);
    }
}
