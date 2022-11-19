//WAP to copy integer array to another array.
import java.util.*;
public class a47 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int [size];
        int [] arr1=new int [size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the elemen at index num: "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Coping the array");
        for(int i=0; i<size; i++){
            arr1[i]=arr[i];
        }
        System.out.println("Printing the copied array: ");
        for(int i=0; i<size; i++){
            System.out.println("Element at index num "+i+" is: "+arr1[i]);
        }
    }
}
