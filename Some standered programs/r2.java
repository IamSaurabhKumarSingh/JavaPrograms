//WAP to do the sum of two matrices.
import java.util.*;
public class r2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of the matrix: ");
        int rsize=sc.nextInt();
        System.out.println("Enter the column size of the matrix: ");
        int csize=sc.nextInt();
        //Defining the matrices>>>>>>
        int [][] matrix1=new int [rsize][csize];
        int [][] matrix2=new int [rsize][csize];
        int [][] matrix3=new int [rsize][csize]; //Blank matrix for storing the added matrix.

        //Code for taking the input into the first matrix.
        System.out.println("Enter the element into the first matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the row: "+i+" and column: "+j);
                matrix1[i][j]=sc.nextInt();
            }
        }
        //Code for diplaying the 1st matrix.
        System.out.println("Diplaying the element of the 1st matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+matrix1[i][j]);
            }
            System.out.println();
        }
        //Code for taking the input into the second matrix.
        System.out.println("Enter th elements into the second matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the row "+i+" and column: "+j);
                matrix2[i][j]=sc.nextInt();
            }
        }
        //Code for displaying the element of the second matrix: 
        System.out.println("Displaying the element of the second matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+matrix2[i][j]);
            }
            System.out.println();
        }
        //Code for Adding both matrices: 
        System.out.println("Adding both matrices: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //Code for displaying the elment after adding matrix 1 and matrix 2 into matrix 3.
        System.out.println("After addition of two matrices the elements are:: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print("   "+matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
