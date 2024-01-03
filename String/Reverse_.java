package String;
import java.util.*;

public class Reverse_ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String original_string=sc.nextLine();
        String reverse_string=Reverse(original_string);
        System.out.println(reverse_string);

    }
    public static String Reverse(String str){
        char[] chararray=str.toCharArray();
        int left=0;
        int right=chararray.length-1;
        char temp;
        while (left<right) {
            temp=chararray[left];
            chararray[left]=chararray[right];
            chararray[right]=temp;
            left++;
            right--;
            
        }
        return new String(chararray);


    }
    
}
