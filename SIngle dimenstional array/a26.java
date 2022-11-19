//WAP to print square of maximum of single dimentional array.
import java.util.*;
public class a26{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int max=arr[0];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max num is: "+max);
        System.out.println("Square of max num is: "+max+" x "+max+" is: "+max*max);
    }
}