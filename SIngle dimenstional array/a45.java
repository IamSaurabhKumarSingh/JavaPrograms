//WAP to return the char array.
import java.util.*;
public class a45 {
    char [] Returnarry(char [] arr){
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        char [] arr=new char[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.next().charAt(0);
        }
        a45 obj=new a45();
        char rarr[]=obj.Returnarry(arr);
        for(int i=0; i<size; i++){
            System.out.println("Element at index num: "+i+" is: "+rarr[i]);
        }
    }
}

