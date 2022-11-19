//WAP to print fabonic series.
import java.util.*;
public class s10 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t1=0,t2=1,nextvar=0;
        //Printing the two terms:
        System.out.println("fibonacci series is:\n"+t1+"\n"+t2);
        nextvar=t1+t2;
        //Now print 3rd to nth term.
        for(int i=3; i<=10; ++i){
            System.out.println(nextvar);
            t1=t2;
            t2=nextvar;
            nextvar=t1+t2;
        }
    }
}
