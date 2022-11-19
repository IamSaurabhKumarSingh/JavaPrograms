//WAP to copy integer array to another array.
import java.util.*;
public class r5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int [] carr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Coping the one array to another array: ");
        for(int i=0; i<size; i++){
            carr[i]=arr[i];
        }
        for(int i=0; i<size; i++){
            System.out.println("New array at index num "+i+" is " +carr[i]);
        }
    }
}
