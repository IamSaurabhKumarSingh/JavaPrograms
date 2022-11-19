//WAP to print sum and average of any number.
import java.util.*;
public class a31 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int i,sum=0, avg=1;
        for(i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(i=0; i<size; i++){
            sum=sum+arr[i];
        }   
        avg=sum/size;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+avg);
     }
}
