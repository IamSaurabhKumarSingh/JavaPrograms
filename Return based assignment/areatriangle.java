//WAP to return the area of triangle.
import java.util.*;
public class areatriangle {
    float Atriangle(float half, float base){
        float triangle = (half*base)/2;
        return triangle;
    }
    public static void main(String [] args){
        areatriangle obj=new areatriangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the half: ");
        float half=sc.nextFloat();
        System.out.println("Enter the base: ");
        float base=sc.nextFloat();

        float atriangle=obj.Atriangle(half,base);
        System.out.println("Area of triangle is: "+atriangle);
    }
}
