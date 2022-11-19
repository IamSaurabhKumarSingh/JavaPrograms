/*Two numbers are input through the keyboard into two locations c and d. write a programe 
 to interchange the contents of c and d
*/
import java.util.*;
public class s5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value into c: ");
        int c=sc.nextInt();
        System.out.println("Enter the value into d: ");
        int d=sc.nextInt();
        c = c+d;
        d = c-d;
        c = c-d;
        System.out.println("After the interchange");
        System.out.println("The value of c is: "+c);
        System.out.println("The value of d is: "+d);
    }
}