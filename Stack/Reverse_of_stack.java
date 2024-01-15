package Stack;

import Stack.LL_imple_stack.stacks;

public class Reverse_of_stack {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;

        }
    }
    static class Stekes{
        public static Node head;
        public static boolean isempty(){
            return head==null;

        }
        public static void push(int data)
        {   Node newnNode=new Node(data);
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
            head = head.next;
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
    public static void  Inserting_buttom_stack(int data,Stekes s)
    {
        if(s.isempty())
        {
            s.push(data);
            return;
        }

        int top=s.pop();
        Inserting_buttom_stack(data, s);
        s.push(top);

    }
    public static void Reverse(Stekes s)

    {
        if(s.isempty())
        {
            return;
        }
        int top=s.pop();
        Reverse(s);
        Inserting_buttom_stack(top, s);

    }

    public static void main(String[] args) {
        Stekes s=new Stekes();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Reverse(s);
        while(!s.isempty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        
        
    }
    
}
