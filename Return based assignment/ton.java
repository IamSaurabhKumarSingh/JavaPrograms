//WAP to return ton of quintal.
import java.util.*;
public class ton{
    double Ton(float quintal){
        double t = quintal/10;
        return t;
    }
    public static void main(String [] args){
        ton obj=new ton();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quintal: ");
        float q = sc.nextFloat();
        double tonis = obj.Ton(q);
        System.out.println(q+" quintal in ton is: "+tonis);
    }
}