//WAP to print the second maximum element of this array.
import java.util.*;
public class a22{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int max=arr[0];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element into array at index num: "+i);
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);   //this is a function to short an array...........
        int len=arr.length;
        System.out.println("the second max element is: "+arr[len-2]); 
        System.out.println("the max element of the array is: "+arr[len-1]);
        //System.out.println("max is: "+max);
    }
}