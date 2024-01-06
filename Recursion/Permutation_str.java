package Recursion;
import java.util.*;

public class Permutation_str {
    public static void PRint_per(String str,String Permutation)
    {
         
        
       if(str.length() == 0)
        {
            System.out.println(Permutation);
            return;
        }
        for(int i =0;i<=str.length()-1;i++)
        {
            char cu=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            PRint_per(newStr, Permutation+cu);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        PRint_per(str, "");
    }
    
}
