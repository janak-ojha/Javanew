package FUnction_in_java;
import java.util.*;

public class Febonacci {
    public static void fb(int n)
    {    
        int c;
        int a=0;
        int b=1;
         
    
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        fb(n);
        
       
    }
    
}
