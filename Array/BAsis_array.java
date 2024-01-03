package Array;
import java.util.*;

public class BAsis_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
       
         for(int i=0;i<size;i++)
         {
            num[i]=sc.nextInt();
         }
        for(int j=0;j<size;j++)
        {
            System.out.println(num[j]);
        }

    }
    
}
