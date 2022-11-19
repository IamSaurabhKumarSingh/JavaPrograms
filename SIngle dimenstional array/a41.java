//WAP to print prime sum and not prime sum of an array.
import java.util.*;
public class a41 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int i, flag=0, sum=0,sum1=0;
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
                //sum=sum+arr[num];
            }
            if(flag==0){
                sum=sum+arr[num];
                System.out.println(arr[num]+" is prime");
                System.out.println("sum prime is: "+sum);
            }
            else{
                sum1=sum1+arr[num];
                System.out.println(arr[num]+" is not prime");
                System.out.println("Not sum prime is: "+sum1);
            }
        }
    }
}
