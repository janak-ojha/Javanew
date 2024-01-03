package Recursion;

public class FInd_occurence_index {
    public static  int first = -1;
    public static int last = -1;
    
    public static void OCCUr(String str,int idx,char element)
    {
        if(idx==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char ocr=str.charAt(idx);
        if(ocr==element)
        {
            if(first==-1)
            {
                first=idx;
            }
            else{
                last=idx;
            }
        }
        OCCUr(str,idx+1,element);

    }
    public static void main(String[] args) {
        String str="aaabvnsjnfjdbaaw";
        OCCUr(str, 0, 'a');
    }
    
}
