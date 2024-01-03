package FUnction_in_java;
import java.util.*;

public class RECURFEbonacci {
    static int a=0,b=1,c;
    public static void fb(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            fb(i-1);

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        fb(i);

        
    }
    
}
