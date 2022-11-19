//WAP to return totalSum of average and sum of single dimentional array.....
import java.util.*;
public class a35 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        a35 obj=new a35();
        int sum1=obj.printsum(arr,size);
        int avg1=obj.printAvg(arr,size);
        System.out.println("Sum of all elements of the array is: "+sum1);
        System.out.println("Average of all elements of the array is: "+avg1);
    }
    int printsum(int [] arr, int size){
        int i,sum=0;
        for(i=0; i<size; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    int printAvg(int [] arr, int size){
        int i,sum=0,avg=1; 
        for(i=0; i<size; i++){
            sum=sum+arr[i];
        }
        return avg=sum/size;
    }
}
