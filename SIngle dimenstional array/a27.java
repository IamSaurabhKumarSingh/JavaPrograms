//WAP to print the cube of minimum element of single dimentional array.
import java.util.*;
public class a27 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<size; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum element of the array is: "+min);
        System.out.println("Cube of the min element of the array is: "+min+" x "+min+" x "+min+" = "+min*min*min);
    }
}
