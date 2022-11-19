//WAP to return the average of 10 to 100 using while loop.
public class p16 {
    int Average(){
        int i=10,avg=0,sum=0,count=0;
        while(i<=100){
            sum=sum+i;
            count++;
            i++;
        }
        avg=sum/count;
        return avg;
    }
    public static void main(String [] args){
        p16 obj=new p16();
        int avg = obj.Average();
        System.out.println("The avg of 10 to 100 is: "+avg);
    }
}
