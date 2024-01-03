package Sorting;

public class Bubble_sort {
    public static void Printarray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        

    }
    public static void main(String[] args) {
        int arr[]={2,3,1,6,4,5};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        Printarray(arr);
    }
    
}
