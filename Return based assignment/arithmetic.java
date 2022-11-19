//
import java.util.*;
public class arithmetic {
    Scanner sc=new Scanner(System.in);
    String operation(int a, int b, int c){
        String res="";
        String res1="";
        System.out.println("Enter 1 for checking even or odd: ");
        System.out.println("Enter 2 for square and cube: ");
        System.out.println("Enter 3 for +ve and -ve: ");
        System.out.println("Enter 4 for sum: ");

        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                if(a%2==0){
                    res = a+" is an even num";
                }
                else if(b%2==0){
                    res = b+" is an even num";
                }
                else if(c%2==0){
                    res = c+" is an even num";
                }
                else{
                    res = a+","+b+" and "+c+" all are odd numbers";
                }
                break;
            case 2: 
                res  = "Square of a*b is: "+(a*b);
                res1  = "Cube of a*b*c is: "+(a*b*c);
                break;
            case 3:
                if(a>0){
                    res = a+" is a +ve num";
                }
                else if(b>0){
                    res = b+" is a +ve num";
                }
                else if(c>0){
                    res = c+" is a +ve num";
                }
                else{
                    res = a+","+b+" and "+c+" all are negative numbers";
                }
                break;
            case 4:
                System.out.println("Enter the 1st num: ");
                float num1=sc.nextFloat();
                System.out.println("Enter the 2nd num: ");
                float num2=sc.nextFloat();
                System.out.println("Enter the 3rd num: ");
                float num3=sc.nextFloat();
                float sum = (num1+num2+num3);
                res = "Sum of three numbers are: "+sum;
                break;
        
            default:
                res = "Please enter the valid num";
                break;
        }
        return res;
    }
    public static void main(String [] args){
         arithmetic obj=new arithmetic();
          Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1 = sc1.nextInt();
        System.out.println("Enter the seond num: ");
        int num2 = sc1.nextInt();
        System.out.println("Enter the third num: ");
        int num3 = sc1.nextInt();

        String operationis=obj.operation(num1,num2,num3);
        System.out.println(operationis);
    }
}
