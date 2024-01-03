package String;
import java.util.*;

public class Reverse_of_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String or_len= sc.nextLine();
        String re_len="";
        for(int i=or_len.length()-1;i>=0;i--)
        {
            re_len+=or_len.charAt(i);
        }
        System.out.println(re_len);
        
        

        
    }
    
}
