//WAP to print the average of 1 to 5 using all loops.
public class N5 {
    public static void main(String [] args){
        /*
        int avg=1, sum=0,i=1;
        //using while loop.
        while(i<=5){
            sum = sum+i;
            i++;
        }
        avg = sum/5;
        System.out.println("Average of 1 to 5 is: "+avg);
*/
        //using do while loop
        int i=1,sum=0;
        int avg=0;
        int count=0;
        do{
         
            sum=sum+i;
            count++;
            i++;
            
        }while(i<=5);
        System.out.println(count);
        avg = sum/count;
        System.out.println("Average of 1 to 5 is: "+avg);
    }
}
