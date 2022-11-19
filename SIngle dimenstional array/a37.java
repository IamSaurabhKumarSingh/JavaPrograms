//WAP to return minimum of array.
import java.util.*;
public class a37 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num "+i);
            arr[i]=sc.nextInt();
        }
        a37 obj=new a37();
        int min=arr[0];
        int minimum=obj.PrintMin(arr,size,min);
        System.out.println("Minimum element of the array is: "+minimum);
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
