package Queue;

public class LL_imple_queue {
     static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class Que{
        static Node head=null;
        static Node tail=null;
        public static boolean isempty()
        {
            return head==null && tail==null;
        }
        public static void Add(int data)
        {
            Node newnode=new Node(data);
            if(tail==null)
            {
                tail=head=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove()
        {
            if(isempty())
            {
                System.out.println("empty");
                return -1;
            }
         
            if(head==tail)
            {
                tail=null;
            }
            int font=head.data;
            
            head=head.next;
            return font;
        }
        public static int peak()
        {
            if(isempty())
            {
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Que q=new Que();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        while(!q.isempty())
        {
            System.out.println(q.peak());
            q.remove();
        }
    }
    
}
