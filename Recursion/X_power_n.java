package Recursion;
import java.util.*;

public class X_power_n {
    public static int POwer(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int power1= POwer(x, n-1);
        int power=x*power1;
        return power;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=POwer(x, n);
        System.out.println(ans);

        
    }
    
}
