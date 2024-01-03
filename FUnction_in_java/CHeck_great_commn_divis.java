package FUnction_in_java;
import java.util.*;

public class CHeck_great_commn_divis {
    public static void Gr(int a,int b)
    {
        while(b !=0)
        {
            int temp=b;
            b=a%b;
            a=temp;

        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        Gr(a, b);
        
    }
    
}
