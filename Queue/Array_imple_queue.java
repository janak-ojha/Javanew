package Queue;

public class Array_imple_queue {
    static class Que{
        static int arr[];
        static int size;
        static int rear = -1;
        Que(int n)
        {
            arr= new int[n];
            this.size=n;

        }
        public static boolean isempty()
        {
            return rear == -1;
        }
        public static void Add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("full Queue");
                return;

            }
            rear++;
            arr[rear]=data;
        }
        public static int remove()
        {
            if(isempty())
            {
                System.out.println("empty");
                return -1;
            }
            int font=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];

            }
            rear--;
            return font;

        }
        public static int peek()
        {
            if(isempty())
            {
                System.out.println("empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Que q=new Que(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(5);
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}
