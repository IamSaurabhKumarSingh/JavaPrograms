//WAP to return maximum of array>>>>>
import java.util.*;
public class a36 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int [size];
        int max=arr[0];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        a36 obj=new a36();
        int maximum=obj.PrintMax(arr,size,max);
        System.out.println("Max is: "+maximum);
    }
     int  PrintMax(int [] arr, int size, int max){
        for(int i=0; i<size; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
