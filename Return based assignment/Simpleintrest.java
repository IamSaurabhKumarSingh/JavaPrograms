//WAP to return the simple intrest.
import java.util.*;

public class Simpleintrest {
    float intrest(float p, float r, float t){
        float A = (p*r*t)/100;
        return A;
    }
    public static void main(String [] args){
        Simpleintrest obj=new Simpleintrest();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle balance: ");
        float p=sc.nextFloat();
        System.out.println("Enter the annual intrest: ");
        float r=sc.nextFloat();
        System.out.println("Enter the time: ");
        float t=sc.nextFloat();
        float Sintrest = obj.intrest(p,r,t);
        System.out.println("Simple intrest is: "+Sintrest);

    }
    
}
