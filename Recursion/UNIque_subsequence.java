package Recursion;
import java.util.*;

public class UNIque_subsequence {
    public static void Str(String st,int idx,String newString,HashSet<String> set)
    {
        if(idx == st.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
          
        char curr= st.charAt(idx);
        Str(st, idx+1, newString+curr,set);
        Str(st, idx+1, newString,set);
        
    }
    public static void main(String[] args) {
        String st="aaa";
        HashSet<String> set=new HashSet<>();
        Str(st, 0, "",set);
    }
    
}

