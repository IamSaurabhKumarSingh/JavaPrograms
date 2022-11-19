//WAP to print week days using switch case.
import java.util.*;
public class C1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Sunday: ");
        System.out.println("Enter 2 for Monday: ");
        System.out.println("Enter 3 for Tuesday: ");
        System.out.println("Enter 4 for Wednesday: ");
        System.out.println("Enter 5 for Thursday: ");
        System.out.println("Enter 6 for Friday: ");
        System.out.println("Enter 7 for Saturday: ");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Please enter the rigth choice:---->");

        }
    }
}