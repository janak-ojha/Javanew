package Recursion;
import java.util.*;

public class Asending_or_not {
    public static boolean issorted(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return true;
        }
        if(arr[idx]<arr[idx+1])
        {
            return issorted(arr, idx+1);
        }
        else
        {
            return false;

        }

    }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(issorted(num, 0));

    }
    
}
