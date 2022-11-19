//Three main ways to create an array in java.
public class A1{
    public static void main(String [] args){
     //1.Declaration along with memory allocation.
      //  int [] marks=new int[5]; //-->Declaration and memory allocation.
     //2.Declaration and then memory allocation.
       // int [] marks;  //-->Declaration
      //  marks = new int[5]; //-->Memory allocataion
    
    /*  marks[0]=78;
        marks[1]=24;
        marks[2]=55;
        marks[3]=45;
        marks[4]=77;    */ 
        //printing the value of the array using loop.

     //3.Declaration,memory allocation and initialization together.
        int [] marks = {2,3,4,5,6}; //this is declaration,memory allocation and intialization.
        for(int i=0; i<5; i++)
        System.out.println("Value at index num "+i+" is: "+marks[i]);
    }
}