//WAP to change the case of string.
import java.util.*;
public class s9{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        s.toLowerCase(); //toLowerCase(); function is used for changing UpperCase string into LowerCase string.
        s.toUpperCase(); //toUpperCase(); function is  used for changing LowerCase string into UpperCase string.
        System.out.println("String in lowecase is: "+s.toLowerCase());
        System.out.println("String in uppercase is:  "+s.toUpperCase());
    }
}