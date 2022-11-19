//WAP to print the factorial of array.
import java.util.*;
public class a51 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        float [] arr=new float[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextFloat();
        }
        float fact=1;
        for(int i=0; i<size; i++){
            fact = fact*arr[i];
        }
        System.out.println("Factorial of array is: "+fact);
    }
}
