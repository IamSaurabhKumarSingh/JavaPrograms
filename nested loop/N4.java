//WAP to print the table of 1 to 5 using nested loop.

public class N4 {
    public static void main(String [] args){
        int table=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=10; j++){
                table = i*j;
                System.out.println("Table is: "+table);
            }
            System.out.print("\n");
        }
    }  
}