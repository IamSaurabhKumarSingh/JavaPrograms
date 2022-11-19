import java.util.*;
public class p {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //Declaration along with memeory allocation.
        //int [] arr=new int[5];
        //Declaration and then memory allocation.
        // int [] arr;  //This is a declaration.
        // arr = new int[5]; //And this is a memory allocation.
        int [] arr={3,4,5,6,1};
         
        /*for(int i=0; i<5; i++){
            System.out.println("Value at index num "+i);
            arr[i]=sc.nextInt();
        }*/
        for(int i=0; i<5; i++){
            System.out.println("Value at index num: "+i+" is: "+arr[i]);
        }
    }
}
