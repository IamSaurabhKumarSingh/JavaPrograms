//WAP to create the single dimentional array of char type.
import java.util.*;
public class a2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        char [] arr=new char[size];
        for(int i=0; i<size; i++){
            //Scanner sc=new Scanner(System.in);
            System.out.println("Enter the vlaue at index "+i+" ");
            
        arr[i]=sc.next().charAt(0);
        }
        for(int i=0; i<size; i++){
            System.out.println("array is: "+arr[i]);
        }

    }
}