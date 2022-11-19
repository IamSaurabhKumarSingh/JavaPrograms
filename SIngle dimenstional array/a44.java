//WAP to return long array.
import java.util.*;
public class a44 {
    long [] Returnarry(long [] arr){
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        long [] arr=new long[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextLong();
        }
        a44 obj=new a44();
        long rarr[]=obj.Returnarry(arr);
        for(int i=0; i<size; i++){
            System.out.println("element at index num "+i+" is: "+rarr[i]);
        }
    }
}
