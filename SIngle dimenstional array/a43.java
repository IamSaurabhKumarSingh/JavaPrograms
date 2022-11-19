//WAP to return integer array.
import java.util.*;
public class a43 {
    int [] Returnarry(int [] arr){
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int [size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        a43 obj=new a43();
        int rarr[]=obj.Returnarry(arr);
        for(int i=0; i<size; i++){
            System.out.println("element at index num "+i+" is: "+rarr[i]);
        }
    }
}
