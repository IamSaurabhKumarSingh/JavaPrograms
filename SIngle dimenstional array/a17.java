//WAP to print sum and average of only even num in array.
import java.util.*;
public class a17 {
public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int sum=0,avg=0,count=0;
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
                count++;
            }
        }
        avg=sum/count;
        System.out.println("Sum of even num of the array is: "+sum);
        System.out.println("average of even num of the array is: "+avg);
}
}
