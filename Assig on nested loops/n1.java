//WAP to print factorial of 1 to 5 using nested loop.
public class n1{
    public static void main(String [] args){
        int fact=1;
        for(int i=1; i<=5; i++){
            fact=1; 
            for(int j=1; j<=i; j++){
                fact = fact*j;
            }
        }
        System.out.println("factorial is: "+fact);
    }
}