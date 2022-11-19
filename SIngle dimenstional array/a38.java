//WAP to return the diffrence of maximum and minmum number.
import java.util.*;
public class a38 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int max=arr[0];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        a38 obj=new a38();
        int maximum=obj.PrintMax(arr,size,max);
        System.out.println("Maximum element of the array is: "+maximum);
        int minimum=obj.PrintMin(arr,size,min);
        System.out.println("Minimum element of the array is: "+minimum);
        int diff=maximum-minimum;
        System.out.println("Diffrence between maximum and minimum element of the array is: "+diff);
    }
    int PrintMax(int [] arr, int size, int max){
        for(int i=0; i<size; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    int PrintMin(int [] arr, int size, int min){
        for(int i=0; i<size; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
