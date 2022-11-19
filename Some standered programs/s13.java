//WAP to print the sum of two arrays.
import java.util.*;
public class s13 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr1=new int[size];
        int [] arr2=new int[size];
        //Code for taking the element input into 1st array.
        System.out.println("Enter the element into 1st array: ");
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the element in second array: ");
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr2[i]=sc.nextInt();
        }
        //Code for the sum of 1st array.
        System.out.println("Sum of 1st array--> ");
        int sum1=0;
        for(int i=0;  i<size; i++){
            sum1=sum1+arr1[i];
        }
        System.out.println(sum1);
        //Code for the sum of 2nd array.
        int sum2=0;
        System.out.println("Sum of 2nd array--> ");
        for(int i=0; i<size; i++){
            sum2=sum2+arr2[i];
        }
        System.out.println(sum2);
        //Code for sum of both array.
        System.out.println("Sum of both array is: "+(sum1+sum2));
    }
}
