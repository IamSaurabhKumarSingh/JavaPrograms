//WAP to pass float array to function.
import java.util.*;
public class a33 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        float [] arr=new float[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextFloat();
        }
        a33 obj=new a33();
        obj.printArray(arr,size);
}
    void printArray(float [] arr, int size){
        for(int i=0; i<size; i++){
            System.out.println("Value at index num: "+i+" is: "+arr[i]);
        }
    }
}