//WAP to return cm of meter.
import java.util.Scanner;
public class Cm {
    int CM(int meter){
        int cm = meter*100;
        return cm;
    }
    public static void main(String [] args){
        Cm obj=new Cm();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the meter: ");
        int m = sc.nextInt();
        int Return = obj.CM(m); 
        System.out.println(m+ " meter into centimeter is: "+Return);
    }
}
