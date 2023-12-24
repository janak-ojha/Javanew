package User_input;
import java.util.Scanner;
public class Table_of_n {
    public static void main(String[] args)
    {   int k=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)

        {   k=n*i;
             System.out.println(n +"*"+i+"="+k);
            
        }
      


    }
    
}
