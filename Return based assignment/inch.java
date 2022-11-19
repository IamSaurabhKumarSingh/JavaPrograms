//WAP to return cm to inch
import java.util.*;

public class inch {
    double centemeter(float inch){
        double cm = 2.54*inch;
        return cm;
    }
    public static void main(String [] args){
        inch obj=new inch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inch: ");
        float i=sc.nextFloat();
        double cm = obj.centemeter(i);
        System.out.println(i+" inch in centementer is equal to: "+cm);

        
    }    
}
