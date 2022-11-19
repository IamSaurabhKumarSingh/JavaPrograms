//WAP to print the factorial of 1 to 5 using nested loop.
public class N1{
    public static void main(String [] args){
        //int fact=1; if we initialize fact out of loop body then the ans will be wrong.
        for(int num=1; num<=5; num++){
            int fact=1;
            for(int i=1; i<=num; i++){
                fact = fact*i;
                System.out.println("The factorial of 1 to 5 is: "+fact);
            }
        }   
    }
}