//WAP to find length of string using built in function.
import java.util.*;
public class s11 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++){
            count++;
        }
        System.out.println("Length of string "+s+" is: "+count);
    }
}
