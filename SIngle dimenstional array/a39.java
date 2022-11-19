//WAP to return average of even num of an array....
import java.util.*;
public class a39 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int sum=0,avg=1;
        a39 obj=new a39();
        int average=obj.PrintAVG(arr,size,sum,avg);
        System.out.println("The average of even num is: "+average);
    }
    int PrintAVG(int [] arr, int size,int sum, int avg){
        int count=0;
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
                count++;
            }
        }
            avg=sum/count;
        return avg;
    }
}
