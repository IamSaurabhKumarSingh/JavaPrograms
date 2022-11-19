//WAP to copy float array>>>>>>>>
import java.util.*;
public class a30 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        float [] arr=new float[size];
        float [] marr=new float[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextFloat();
        }
        System.out.println("Copied elements are: ");
        for(int i=0; i<size; i++){
            marr[i]=arr[i];
            System.out.println("elment at index num: "+i+" is: "+marr[i]);
        }
    }
}
