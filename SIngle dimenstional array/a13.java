//WAP to print the square of long array.
import java.util.*;
public class a13 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        long [] arr=new long[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextLong();
        }
        for(int i=0; i<size; i++){
            System.out.println(arr[i]+" X "+arr[i]+" square is: "+arr[i]*arr[i]);
        }
    }
}
