package FUnction_in_java;
import java.util.*;

public class Functio_check_gr_ag_two {
    public static void  Check(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+"is greater");
        }
        else if(a==b)
        {
            System.out.println("both are equal");
        }
        else
        {
            System.out.println(b+"is grrater");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        Check(a, b);
        
    }
    
}
