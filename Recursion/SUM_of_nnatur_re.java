package Recursion;
import java.util.*;

public class SUM_of_nnatur_re {
    public static void NATU(int i,int n,int sum)
    {  if(i==n+1)
        {
            System.out.println(sum);
            return;
        }
        sum += i;
        NATU(i+1,n,sum);
    }
    public static void main(String[] args) {
        NATU(1, 5, 0);
    }
}
