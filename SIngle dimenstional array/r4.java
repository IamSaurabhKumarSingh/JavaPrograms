//WAP to check that the user input element of the arrays are prime or not.
import java.util.*;
public class r4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int i,flag=0;
        for(i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        for(int num=0; num<size; num++){
            for(i=2; i<arr[num]; i++){
                flag=0;
                if(arr[num]%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(arr[num]+" is prime");
            }
            else{
                System.out.println(arr[num]+" is not prime");
            }
        }
    }
}
