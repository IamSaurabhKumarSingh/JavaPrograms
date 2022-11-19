//WAP to print multi dimentional array.
public class n3 {
    public static void main(String [] args){
        int [][][] arr=new int[][][]{
                                    {
                                        {1,2,3},
                                        {4,5,6},
                                        {7,8,9}
                                    }
                                };
                for(int i=0; i<1; i++){
                    for(int j=0; j<3;j++)
                    {
                        for(int k=0; k<3; k++){
                            System.out.print(arr[i][j][k]);
                        }
                        System.out.println();
                    }
                }
    }
}
