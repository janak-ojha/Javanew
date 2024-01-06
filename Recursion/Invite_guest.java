package Recursion;
import java.util.*;

public class Invite_guest {
    public static int Invit(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int ways1=Invit(n-1);
        int ways2=(n-1)*Invit(n-2);
        return ways1+ways2;
        
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Invit(n));
    }
    
}
