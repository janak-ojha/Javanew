package Array;

import java.util.Scanner;

public class finding_subarray {
    public static void finde(int arr[])
    { 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        finde(arr);
    }
    


        
    }

    

