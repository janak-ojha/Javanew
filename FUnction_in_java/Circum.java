package FUnction_in_java;
import java.util.*;

public class Circum {
    public static void Cir(int r)
    {
        double pi=Math.PI;
        double cire=2*pi*r;
    System.out.println("the circumference of Circle is :"+cire);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        Cir(r);
        
    }
    
}
