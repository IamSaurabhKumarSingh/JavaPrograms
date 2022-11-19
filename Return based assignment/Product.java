//WAP to return the product of any five numbers.
import java.util.*;
public class Product {
    float Pnum(float a, float b, float c, float d, float e){
        float p=a*b*c*d*e;
        return p;
    }
    public static void main(String [] args){
        Product obj=new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        float num1=sc.nextFloat();
        System.out.println("Enter the second num: ");
        float num2=sc.nextFloat();
        System.out.println("Enter the third num: ");
        float num3=sc.nextFloat();
        System.out.println("Enter the fourth num: ");
        float num4=sc.nextFloat();
        System.out.println("Enter the fifth num: ");
        float num5=sc.nextFloat();

        float product=obj.Pnum(num1,num2,num3,num4,num5);
        System.out.println("The product of five num is: "+product);
    }
}
