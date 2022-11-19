//WAP to print the diffrence of maximum and minimum element of single dimentional array.
import java.util.*;
public class a21 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int max=arr[0];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element of the in index num: "+i);
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<size; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max element of this array is: "+max);
        System.out.println("Min element of this array is: "+min);
        System.out.println("The diffrence between max and min element of this array is: "+(max-min));
    }
}
