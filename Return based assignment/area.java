//WAP to return the area of circle.
import java.util.*;
public class area {
    double areaNum(float radius){
        double areacircle = 3.14*radius*radius;
        return areacircle;
    }
    public static void main(String [] args){
        area obj=new area();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r=sc.nextFloat();
        double area=obj.areaNum(r);
        System.out.println("Area of circle is: "+area);
    }
    
}
