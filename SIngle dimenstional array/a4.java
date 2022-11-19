//WAP to create a single dimentional array of string type.
import java.util.*;
public class a4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        
        //System.out.println(" your name is  :"+name);
         String [] arr=new String[size+1];
        //Taking the input from the user.
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the string at index num: "+i);
            arr[i]=sc.nextLine();
        }
        //Printing the user input....
        for(int i=0; i<size; i++)
        {
            System.out.println("String at index num: "+i+" is: "+arr[i]);
        }
     }
    }

