//WAP to print the sum of two matrices.
import java.util.*;
public class s14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of the matrix");
        int rsize=sc.nextInt();

        System.out.println("Enter the column size of the matrix");
        int csize=sc.nextInt();

        //Defining the both matrices.
        int [][] matrix1=new int[rsize][csize];
        int [][] matrix2=new int[rsize][csize];
        int [][] matrix3=new int[rsize][csize]; //This is a  blank matrix for storing the sum elments of two matrices.

        //Code for taking the element into the first matrix.
        System.out.println("Taking the element into the 1st matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print("enter "+i+" row and "+j+" column");
                matrix1[i][j]=sc.nextInt();
            }
        }
        //Displaying the element of the 1st matrix.
        System.out.println(" Displaying first matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
               System.out.print(" "+matrix1[i][j]);
            }
        System.out.println();
        }
        //Code for taking the element into the second matrix.
        System.out.println("Enter the element at second matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print("Enter "+i+" row and "+j+" column");
                matrix2[i][j]=sc.nextInt();
            }
        }
        //Code for diplaying the element of 2nd matrix.
        System.out.println("Diplaying the elment of the second matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+matrix2[i][j]);
            }
            System.out.println();
        }
        //Code for adding both matrices.
        System.out.println("Adding the both matrices: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
               matrix3[i][j] = matrix1[i][j] + matrix2[i][j]; 
            }
        }
        //Code for displaying the 3rd matrix after doing sum of 1st and 2nd matrix.
        System.out.println("Diplying the added matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
