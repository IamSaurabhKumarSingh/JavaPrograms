//WAP to print sum of long array>>
import java.util.*;
public class a34{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        long [] arr=new long[size];
        for(int  i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextLong();
        }
        a34 obj=new a34();
        obj.PrintSum(arr,size);
    }
    void PrintSum(long [] arr, int size){
        long sum=0;
        for(int i=0; i<size; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of long array is: "+sum);
    }
}