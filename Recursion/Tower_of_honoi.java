package Recursion;

public class Tower_of_honoi {
    public static void TOwer(int n,String src,String helper,String Dest)
    {
        if(n==1)
        {
            System.out.println("transfer disc "+n+" from "+src+" to "+Dest);
            return;
        }
        TOwer(n-1, src, Dest, helper);
        System.out.println("transfer disc "+n+" from "+src+" to "+Dest);
        TOwer(n-1, helper, src, Dest);
    }
    public static void main(String[] args) {
        int n=3;
        TOwer(n, "S", "H", "D");
    }
    
}
