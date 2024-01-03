package Recursion;

public class Reverse_of_str {
    public static void REV(String str,int idx)
    {
        if (idx==0)
        {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        REV(str, idx-1);
    }
    public static void main(String[] args) {
        String str="jana";
        REV(str, str.length()-1);
    }
    
}
