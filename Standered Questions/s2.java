/*The distance betwen two cities(in km) is input through the keyboard, WAP to convert
and print this distance in meters, feet, inches and centimeters.
*/
import java.util.*;
public class s2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance between two cities in km: ");
        float distance=sc.nextFloat();
        float meters=distance*1000;
        double feet=distance*3280.8399;
        double inches=distance*39370.0787;
        double centimeters=distance*100000;
        System.out.println("The distance between two cities in meters is: "+meters);
        System.out.println("The distance between two cities in feet is: "+feet);
        System.out.println("The distance between two cities in inches is: "+inches);
        System.out.println("The distance between two cities in centimeters is: "+centimeters);

    }
}
