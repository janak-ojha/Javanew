package Array;
import java.util.*;

public class BAsis_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size  array");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("enter tje gi");

       
         for(int i=0;i<size;i++)
         {
            num[i]=sc.nextInt();
         }
        for(int i=0;i<size;i++)
        {
            System.out.print(num[i]);
        }

    }
    
}
