package FUnction_in_java;
import java.util.*;

public class Sum_of_n_odd {
    public static void sumODD(int n)
    {
        int odd=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                odd=odd+i;
            }
            
        }
        System.out.println("the sum  odd num is :"+odd);

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumODD(n);
        
        
    }
    
}
