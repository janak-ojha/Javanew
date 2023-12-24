package User_input;

import java.util.Scanner;

public class Sum_of_n {
    public static void main (String [] args)
    { int sum=0;
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt(); 
      for(int i=1;i<num;i++)
      {
        sum=sum+i;

      }
      System.out.println(sum);

    }
    
}
