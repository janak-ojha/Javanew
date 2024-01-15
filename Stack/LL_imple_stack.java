package Stack;


public class LL_imple_stack {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class stacks{
        public  static Node head;
        public static boolean isempty()
        {
            return head==null;
        }
        public static void push(int data)
        {
            Node newnNode=new Node(data);
            if(isempty())
            {
                head=newnNode;
                return;
            }
            newnNode.next=head;
            head=newnNode;
        }
        public static int pop()
        {
            if(isempty())
            {
                return -1;
            } 
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek()
        {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        stacks s=new stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isempty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
