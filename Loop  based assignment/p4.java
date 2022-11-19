//WAP to print even sum and odd sum of 1 to 10.
public class p4 {
    public static void main(String [] args){
        int num=10,sum=0,sum1=0;
        for(int i=1; i<=num; i++){
            if(i%2==0){
                sum=sum+i;
            }
            else{
                sum1=sum1+i;
            }
        }
        System.out.println("The sum of even num from 1 to 10 is: "+sum);
        System.out.println("The sum of odd num from 1 to 10 is: "+sum1);
    }
}
