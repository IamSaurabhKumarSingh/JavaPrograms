//WAP to creat a single dimentional array of float type.
import java.util.*;
public class a3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        float [] arr=new float[size];
        //Taking the value into the array...........
        for(int i=0; i<size; i++){
            System.out.println("Enter the array into index: "+i+" ");
            arr[i]=sc.nextFloat();
        }
        //Displaying the array vlaue..........
        for(int i=0; i<size; i++){
            System.out.println("Array at index: "+i+" is: "+arr[i]);
        }
    }
}
 