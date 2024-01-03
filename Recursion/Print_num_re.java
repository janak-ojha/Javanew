package Recursion;

public class Print_num_re {
    public static void Printenum(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        Printenum(num-1);
    }
    public static void main(String[] args) {
        int num=8;
        Printenum(num);
    }
    
}
