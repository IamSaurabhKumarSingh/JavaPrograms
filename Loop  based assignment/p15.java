//WAP to return the sum of even num of 2 to 50 using while loop
//import java.util.*;
public class p15 {
    int add(){
        int i=2,sum=0;
        while(i<=50){
            if(i%2==0)
                sum=sum+i;
            i++;
        }
        return sum;
    }
    public static void main(String [] args){
        p15 obj=new p15();
        //Scanner sc=new Scanner(System.in);
        int sum = obj.add();
        System.out.println("Sum between 2 to 50 is: "+sum);
    }
}
