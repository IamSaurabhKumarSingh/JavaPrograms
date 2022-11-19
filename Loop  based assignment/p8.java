//WAP to print squaresum and cubesum of 1 to 10 using for loop
public class p8{
    public static void main(String [] args){
        int sum=0,s=1,q=1,sum1=0;
        for(int i=1; i<=10; i++){
            // code for the sum of square...........
            s = i*i;
            sum = sum+s;
           // code for the sum of cube..........
            s = i*i*i;
            sum1 = sum1+s;
           
        }
        System.out.println("sum of square is: "+sum);
        System.out.println("sum of cube is: "+sum1);
        
    }
}