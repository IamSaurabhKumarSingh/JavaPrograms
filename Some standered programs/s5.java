//WAP input 10 num add it and find its average.
import java.util.*;
public class s5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float sum=0;
        float avg=1;
        for(int i=1; i<=10; i++){
            System.out.println("Enter the "+i+" num");
            int num=sc.nextInt();
            sum=sum+num;
        }
        avg=sum/10;
        System.out.println("Sum of the num is: "+sum);
        System.out.println("The average the entered 10 num is: "+avg);

    }
}
