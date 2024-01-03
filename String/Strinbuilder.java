package String;
import java.util.*;

public class Strinbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.insert(1, "h");
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);
        sb.append("k");
        System.out.println(sb);
    }
    
}
