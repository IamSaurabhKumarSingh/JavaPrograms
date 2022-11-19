//WAP to copy String elements........
import java.util.*;
public class a29 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        String [] arr=new String[size];
        String [] marr=new String[size];
        //int i;
        for(int i=0; i<size+1; i++){
           // System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextLine(); //correct this error.............here is it..........
        }
        System.out.println("Copied elements are:::::");
        for(int i=0; i<size; i++){
            marr[i]=arr[i];
            System.out.println("Element at index num: "+i+" is: "+marr[i]);
        }
    }
}
