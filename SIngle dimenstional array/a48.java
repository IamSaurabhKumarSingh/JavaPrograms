//Reverse the string array.
import java.util.*;
public class a48 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        String [] arr=new String[size];
        System.out.println("Enter the string into string array: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("Now printing the String array into reverse order: ");
        for(int i=size-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
