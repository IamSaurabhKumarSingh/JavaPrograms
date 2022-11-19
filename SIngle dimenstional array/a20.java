//WAP to print the minimum of single dimentional array.
import java.util.*;
public class a20 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int [size];
        //int min=arr[0];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element in index num: "+i);
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<size; i++){
           // System.out.println("mn--> "+min);   ->this line is just checking the code .........
            //System.out.println("arr[i] --> "+arr[i]);  -->this line is also for checking the code.........
            if(min>arr[i]){
                min=arr[i];
                //System.out.println("min num is: "+min);   -->this line is too checking the code......
            }
        }
        System.out.println("The minimum element of this array is: "+min);
    }
}
