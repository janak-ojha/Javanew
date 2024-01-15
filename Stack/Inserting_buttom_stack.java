package Stack;

public class Inserting_buttom_stack {
     static class Node{
        int data;
        Node next;
         public Node(int data)
        {
            this.data=data;
            next=null;

        }
    }
     static class Stackes{
        public static  Node head;
        public static  boolean isempty()
        {
            return head==null;
        }
        public static void push(int data){
        Node newnNodes=new Node(data);
        if(isempty())
        {
            head =newnNodes;
            return;
        }
        newnNodes.next=head;
        head=newnNodes;
        }
        public static int pop(){
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
    public static void Pushat_bottom(int data,Stackes s)
    {   if(s.isempty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        Pushat_bottom(data, s);
        s.push(top);

    }
    public static void main(String[] args) {
        Stackes s=new Stackes();
        s.push(1);
        s.push(2);
        s.push(3);
        Pushat_bottom(4, s);
        while (!s.isempty()) 
        {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
   


    }
    

