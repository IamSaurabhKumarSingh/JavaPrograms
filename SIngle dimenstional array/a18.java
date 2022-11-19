//WAP to print the multiplication of odd numbers of single dimentional array.
import java.util.*;
public class a18 {
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int [] arr=new int[size];
    for(int i=0; i<size; i++){
        System.out.println("Enter the value at index num "+i);
        arr[i]=sc.nextInt();
    }
    for(int i=0; i<size; i++){
        if(arr[i]%2==0){
            System.out.println("Multiplication of odd elements of the array: "+arr[i]+" X "+arr[i]+" is: "+arr[i]*arr[i]);
        }
    }
}
}
