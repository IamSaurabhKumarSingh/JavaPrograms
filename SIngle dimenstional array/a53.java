//WAP to print the factorial of max and min element of array.
import java.util.*;
public class a53 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int max=arr[0];
        //System.out.println("mmm is "+max);
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        //System.out.println("mmm is "+max);
        int min=arr[0];
        //System.out.println("minnnnn is: "+min);
        int fact=1;
        for(int i=0; i<size; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element of the array is: "+max);
        for(int i=0; i<size; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum element of the array is:  "+min);
        //Code for factorial of maximum element of the array>>>>>>>>>
        for(int i=1; i<=max; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of maximum element of the array is: "+fact);
        //Code for factorial of minimum element of the array>>>>>>>>>>
        int f=1;
        for(int i=1; i<=min; i++){
            f = f*i;
        }
        System.out.println("Factorial of minimum element of the array is: "+f);
    }
}
