//WAP to find whether a given string is PALINDROM of NOT.
public class s8 {
    public static void main(String [] args){
        String s="hannah";
        int len=s.length(); //calling length() fun for finding the size of string.
        String s1=""; //takind s1 string var for comparing reverse string to real string
        for(int i=len-1; i>=0; i--){
           // System.out.print(s.charAt(i));
            s1+=s.charAt(i); //here in s1 reverse string is stored.
            
        }
        if(s1.equals(s)){ //calling equal fun to check that reverse and real string is equal or not.
             System.out.println(s+" String is palindrom: ");
        }
        else{
            System.out.println(s1+" String is not palindrom: ");
        }
    }
}
