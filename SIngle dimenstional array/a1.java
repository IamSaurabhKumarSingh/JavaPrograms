//WAP to create single dimentionala array and store the value using user input.
import java.util.*;
public class a1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();

        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {
           System.out.println("Enter "+i+" index value");
            arr[i]=sc.nextInt();

        }


        //displaying array value using for each loop
         for(int k:arr)
        {

            System.out.println(k);
        }

        //displaying aray value using for loop
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);

        }

        //displaying array vlaue using for loop
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}