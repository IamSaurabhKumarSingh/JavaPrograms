//WAP to copy integer array.
import java.util.*;
public class a28 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr=new int[size];
        int [] marr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Copied elements are: ");
        for(int i=0; i<size; i++){
            marr[i]=arr[i];
            System.out.println(" element at index num: "+i+" is: "+marr[i]);
        }
    }
}
