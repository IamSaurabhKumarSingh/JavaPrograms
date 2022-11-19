//WAP to print the sum of left diagonal matrix.
import java.util.*;
public class n4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int rsize=sc.nextInt();
        System.out.println("Enter the size of column: ");
        int csize=sc.nextInt();
        int [][] arr=new int[rsize][csize];
        
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter "+i+" for row and "+j+" for column");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                
                if(j==csize-1 || j==csize-2 || j==csize){
                    System.out.println(arr[i][j]);
                }
                
               /* System.out.println("hiiiiiiiiii ");
                System.out.print(arr[i][j]);
                System.out.println("\nbyee ");*/
            }
            System.out.println();
        }
    }
}
