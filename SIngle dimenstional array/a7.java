//WAP to print the sum of float type array.
import java.util.*;
public class a7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        float sum=0;
        float [] arr=new float[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at indext num: "+i);
            arr[i]=sc.nextFloat();
        }
        for(int i=0; i<size; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the array element is: "+sum);
    }
}
