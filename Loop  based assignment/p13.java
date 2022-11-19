//WAP to print the avg of 1 to 20 using while loop
public class p13 {
    public static void main(String [] args){
        int i=1,avg=0,average=0;
        while(i<=20){
            avg = (avg+i);
            average = avg/20;
            i++;
        }
        System.out.println("Avg is: "+average);
    }
}
