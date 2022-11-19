//WAP to print the total table sum of an array.
import java.util.*;
public class a57 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int sum=0; 
        for(int i=0; i<size; i++){
            for(int j=1; j<=10; j++){
                int table = arr[i]*j;
                System.out.println(arr[i]*j+" = "+table);
                sum = sum+table;
            }
            System.out.println();
        }
        System.out.println("Sum of total table of the array is: "+sum);
    }
}
