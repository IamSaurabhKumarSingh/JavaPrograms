//WAP to print the sum of 50 to 5 using while loop
public class p11 {
    public static void main(String [] args){
        int num=5, i=50,sum=0;
        while(i>=num){
            sum = sum+i;
            i--;
        }
        System.out.println("The sum of 50 to 5 is: "+sum);
    }
}
