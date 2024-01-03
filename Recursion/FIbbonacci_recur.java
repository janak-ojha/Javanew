package Recursion;
import java.util.*;

public class FIbbonacci_recur {
    public static void FIBRRR(int a,int b,int temp,int i,int n)
    {
        if (i==n+1)
        {
            
            return;
        }
        temp=b;
        b=a+b;
        System.out.println(b);
        a=temp;
        FIBRRR(a, b, temp, i+1,n);

    }
    public static void main(String[] args) {
       FIBRRR(0, 1, 0, 1, 10);
        
       
    }
    
}
