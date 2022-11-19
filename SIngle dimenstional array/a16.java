//WAP to print the average of array.
import java.util.*;
public class a16 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int avg=0,sum=0;
        for(int i=0; i<size; i++){
            System.out.println("Ente the value of the array at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            sum = sum+arr[i];
        }
        avg=sum/size;
        System.out.println("The average of "+size+" is: "+avg);
    }
}
