package String;
import java.util.*;
public class Basis_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first_name=sc.nextLine();
        String last_name=sc.nextLine();
        String Name=first_name+" "+last_name;
        System.out.println(Name);
        for(int i=0;i<=Name.length();i++)
        {
            System.out.println(Name.charAt(i));
        }

    }
    
}
