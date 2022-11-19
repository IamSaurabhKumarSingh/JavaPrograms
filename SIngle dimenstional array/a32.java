//WAP to pass integer array to function and print them....
import java.util.*;
public class a32 {

    void printArr(int [] arr, int size)
    {
        for(int i=0; i<size; i++){
            System.out.println("Value at index num: "+i+" is: "+arr[i]);
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }

        a32 obj=new a32();
        obj.printArr(arr,size);

    }
}
