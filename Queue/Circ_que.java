package Queue;

public class Circ_que {
    static class Cir
    {
        static int [] arr;
        static int rear = -1;
        static int font = -1;
        static int size;
        Cir(int n)
        {
            arr=new int[n];
            this.size=n;
        }
        public static boolean isempty()
        {
            return rear==-1 && font==-1;
        }
        public static boolean isfull()
        {
            return (rear+1) % size == font;
        }
        public static void Add(int data)
        {
            if(isfull())
            {
                System.out.println("full");
                return;

            }
            if(font == -1)
            {
                font=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove()
        {
            if(isempty())
            {
                System.out.println("is empty");
                return -1;
            }
            int result=arr[font];
            //single emelemt condtion
            if(rear==font)
            {
                rear=font=-1;
            }
            else{

                font=(font+1)%size;
            }
            return result;
        }
        public static int peak()
        {if(isempty())
        {
            System.out.println("empty");
            return -1;
        }
        return arr[font];
    }
    }
    public static void main(String[] args) {
        Cir q=new Cir(4);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        System.out.println(q.remove());
        
        q.Add(4);
        System.out.println(q.remove());
        q.Add(5);
        while (!q.isempty()) {
            System.out.println(q.peak());
            q.remove();
            
        }
    }

    
}
