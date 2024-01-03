
package FUnction_in_java;
import java.util.*;

public class Sum_of_two {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        System.out.println("the sum is :"+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
       
        
    }
    
}
