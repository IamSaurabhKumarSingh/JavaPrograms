//WAP to print the even sum and odd sum of int array.
import java.util.*;
public class a14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int Esum=0,Osum=0;
        for(int i=0; i<size; i++){
            System.out.println("Enter the value at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){
                Esum=Esum+arr[i];
            }
            else{
                Osum=Osum+arr[i];
            }
        }
        System.out.println("Even sum is: "+Esum);
        System.out.println("Odd sum is: "+Osum);
        
    }
}
