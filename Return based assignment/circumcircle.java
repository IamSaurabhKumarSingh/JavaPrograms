//WAP to return the circum of circle
import java.util.*;

public class circumcircle {
    double Circumcircle(float r){
        double circle=2*3.14*r;
        return circle;
    }
    public static void main(String [] args){
        circumcircle obj=new circumcircle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the raius: ");
        float r=sc.nextFloat();
        double circum=obj.Circumcircle(r);
        System.out.println("Circum of circle is: "+circum);
    }    
}
