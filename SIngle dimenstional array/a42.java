//WAP to return float array.
import java.util.*;
public class a42 {
    float [] Returnarry(float [] arr){
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        float [] arr=new float [size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextFloat();
        }
        a42 obj=new a42();
        float rarr[]=obj.Returnarry(arr);
        for(int i=0; i<size; i++){
            System.out.println("Element at index num "+i+" is "+rarr[i]);
        }
    }
}
