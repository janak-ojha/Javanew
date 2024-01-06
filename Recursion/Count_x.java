package Recursion;

public class Count_x {
    public static void Newstr(String str,int idx,int count,String newstring)
    {
        if(idx == str.length())
        {
            for(int i=0;i<=count;i++)
            {
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        char currstr=str.charAt(idx);
        if(currstr == 'x')
        {
            count++;
            Newstr(str, idx+1, count, newstring);
        }
        else{
            newstring += currstr;
            Newstr(str, idx+1, count, newstring);



        }
    }
    public static void main(String[] args) {
        String str="jxxjxhxxxhx";
        Newstr(str, 0, 0," ");

    }
    
}
