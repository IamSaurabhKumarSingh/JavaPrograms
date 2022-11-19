import java.util.*;
public class r2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        String [] arr=new String[size];
        String [] marr=new String[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.next();
        }
        for(int i=0; i<size; i++){
            marr[i]=arr[i];
        }
        //printting the copied elements...
        System.out.println("Copied elements are: ");
        for(String k : marr){
            System.out.println(k);
        }
    }
}
