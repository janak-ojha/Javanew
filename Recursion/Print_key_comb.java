package Recursion;
import java.util.*;

public class Print_key_comb {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Princcomb(String str,int ixd,String comb)
    {
        if(ixd ==str.length())
        {
            System.out.println(comb);
            return;
        }
        char curs=str.charAt(ixd);
        String map=keypad[curs - '0'];
        for(int i=0;i<map.length();i++)
        {
            Princcomb(str,ixd+1,comb+map.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str="23";
        Princcomb(str, 0, "");
    }
    
}
