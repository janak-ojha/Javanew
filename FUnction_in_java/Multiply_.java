package FUnction_in_java;
import java.util.Scanner;

public class Multiply_ {
    public static int MUL(int a, int b)
    {
        
        return a*b;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("the product is :"+MUL(x, y));
        
        
    }
    
}
