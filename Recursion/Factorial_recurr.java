package Recursion;
import java.util.*;

public class Factorial_recurr {
    public static void FCR(int n,int f,int i)
    {
        if (i==n+1)
        {
            System.out.println(f);
            return;
        }
        f*=i;
        FCR(n, f, i+1);
    }
    public static void main(String[] args) {
       FCR(5, 1, 1);
    }
    
}
