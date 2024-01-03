package Sorting;

public class Selection_sort {
    public static void Printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,4,5};
       
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for( int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>j)
                {
                    smallest=j;
                }
                

            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
         Printarray(arr);
    }
   
    
}
