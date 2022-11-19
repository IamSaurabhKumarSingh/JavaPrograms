//WAP to multiply the five matrices.
import java.util.*;
public class s15 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of the matrix: ");
        int rsize=sc.nextInt();
        System.out.println("Enter the column size of the matrix: ");
        int csize=sc.nextInt();
        //Defining the matrices::::
        int [][] m1=new int[rsize][csize];
        int [][] m2=new int[rsize][csize];
        int [][] m3=new int[rsize][csize];
        int [][] m4=new int[rsize][csize];
        int [][] m5=new int[rsize][csize];
        int [][] m6=new int[rsize][csize]; //this is an empty matrix for storing something.

        //Taking the input into the 1st matrix.
        System.out.println("Taking the input into the first matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the "+i+" for row and "+j+" for column");
                m1[i][j]=sc.nextInt();
            }
        }
        //Taking the input into the 2nd matrix.
        System.out.println("Taking the input into the second matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the "+i+" for row and "+j+" for column");
                m2[i][j]=sc.nextInt();
            }
        }
        //Taking the input into the 3rd matrix.
        System.out.println("Taking the input into the third matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the "+i+" for row and "+j+" for column");
                m3[i][j]=sc.nextInt();
            }
        }
        //Taking the input into the 4rth matrix.
        System.out.println("Taking the input into the fourth matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the "+i+" for row and "+j+" for column");
                m4[i][j]=sc.nextInt();
            }
        }
        //Taking the input into the 5th matrix.
        System.out.println("Taking the input into the fifth matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.println("Enter the "+i+" for row and "+j+" for column");
                m5[i][j]=sc.nextInt();
            }
        }

        //Displaying the element of 1st matrix.
        System.out.println("Displaying the element of 1st matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+m1[i][j]);
            }
            System.out.println();
        }
        //Displaying the element of 2nd matrix.
        System.out.println("Displaying the element of 2nd matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+m2[i][j]);
            }
            System.out.println();
        }
        //Displaying the element of 3rd matrix.
        System.out.println("Displaying the element of 3rd matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+m3[i][j]);
            }
            System.out.println();
        }
        //Displaying the element of 4rth matrix.
        System.out.println("Displaying the element of the 4th matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize;  j++){
                System.out.print(" "+m4[i][j]);
            }
            System.out.println();
        }
        //Displaying the element of 5th matrix.
        System.out.println("Displaying the element of 5th matrix: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+m5[i][j]);
            }
            System.out.println();
        }

        //Mutliplying all the matrices.
        System.out.println("Multiplying all the matrices: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                m6[i][j] = m1[i][j] * m2[i][j] * m3[i][j] * m4[i][j] * m5[i][j];
            }
        }
        //Displaying the multiplied elements fo the matrix.
        System.out.println("Displaying the multiplied elements: ");
        for(int i=0; i<rsize; i++){
            for(int j=0; j<csize; j++){
                System.out.print(" "+m6[i][j]);
            }
            System.out.println();
        }
    }
}
