//WAP to check prime and not prime of array.
import java.util.*;
public class a40 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index num: "+i);
            arr[i]=sc.nextInt();
        }
        int flag=0,i;
        for(int num=0; num<size; num++){
            for(i=2; i<arr[num]; i++)
            {
                flag=0;
                if(arr[num]%i==0)
                {
                flag=1;
                break;

                }
            }
                if(flag==0)
                {
                System.out.println(arr[num]+" prime");
                }
                else
                {
                System.out.println(arr[num]+" Not prime");
                }
            }
        }
    }

