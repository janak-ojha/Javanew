package Recursion;
import java.util.*;

public class Subsequence {
  public static void SEQ(String str,int idx,String newString)
  {
    if(idx == str.length())
    {
        System.out.println(newString);
        return;
    }
    char curst=str.charAt(idx);
    SEQ(str, idx+1, newString+curst);
    SEQ(str, idx+1, newString);
  }
  public static void main(String[] args) {
    String str="abc";
    SEQ(str, 0, "");
  }
    
}
