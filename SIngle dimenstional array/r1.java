//WAP to print the minimum element of the single dimentional array.
import java.util.*;
public class r1{
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
        System.out.println("The minmum element of the array is: "+min);
    }
}
