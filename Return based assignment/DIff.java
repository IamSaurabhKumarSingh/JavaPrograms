//WAP to return diffrence of area of circle and circum of circle.
import java.util.*;
public class DIff {
    double Diffrence(float r){
        double Acircle=3.14*r*r;
        double Ccircle=2*3.14*r;
        double diff = Acircle-Ccircle;
        return diff;
    }
    public static void main(String [] args){
        DIff obj=new DIff();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the radius: ");
        float r=sc.nextFloat();

        double diff=obj.Diffrence(r);
    
        System.out.println("Diffrence of area of circle and circum of circle is: "+diff);
    }
}
