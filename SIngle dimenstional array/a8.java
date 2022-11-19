//WAP to print the even or odd of integer array.
import java.util.*;
public class a8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Element at index num "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){
                System.out.println("Element is even: "+arr[i]+" at index num: "+i);
            }
            else{
                System.out.println("Element is odd: "+arr[i]+" at index num: "+i);
            }
        }
    }
}
