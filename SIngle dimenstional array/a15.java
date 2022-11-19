//WAP to print the square of even array and cube of odd array.
import java.util.*;
public class a15 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextInt();
        } 
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){
                System.out.println("Square of even is: "+arr[i]+" X "+arr[i]+" square is: "+arr[i]*arr[i]);
            }
            else{
                System.out.println("Cube of odd is: "+arr[i]+" X "+arr[i]+" X "+arr[i]+" cube is: "+arr[i]*arr[i]*arr[i]);
            }
        }
    }
}
