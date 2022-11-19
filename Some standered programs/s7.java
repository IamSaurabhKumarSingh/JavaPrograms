//WAP to reverse an string.
import java.util.*;
public class s7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        int len=s.length();
        for(int i=len-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
