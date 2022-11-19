//WAP to print the sum of first and last element of the array.
import java.util.*;
public class a49 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<size; i++){
            sum = arr[0]+arr[size-1];
        }
        System.out.println("The sum of 1st and last element of the array is: "+sum);
    }
}
