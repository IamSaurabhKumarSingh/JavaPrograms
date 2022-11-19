
//take the string input from the user and print them.
import java.util.*;
public class a10 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        String [] arr=new String[size+1];

        for(int i=0; i<size+1; i++){
            arr[i]=sc.nextLine();
        }
        for(String k: arr){
            System.out.println(k);
        }
    }
}
