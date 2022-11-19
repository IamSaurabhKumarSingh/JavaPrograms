//WAP to print the diffrence of first and last element of the array.
import java.util.*;
public class a50 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int diffrence=0;
        for(int i=0; i<size; i++){
            diffrence = arr[0]-arr[size-1];
        }
        System.out.println("The diffrence between 1st and last element of the arrayn is: "+diffrence);
    }
}
