//check that string is palindrom or not?
import java.util.*;
public class r1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=sc.nextLine();
        int len=s.length();
        String s1="";
        for(int i=len-1; i>=0; i--){
            s1+=s.charAt(i);
        }
        System.out.println("Real string is: "+s);
        System.out.println("reverse string is: "+s1);
        if(s1.equals(s)){
            System.out.println(s+" is palindrom");
        }
        else{
            System.out.println(s+" is not palindrom");
        }
    }
}
