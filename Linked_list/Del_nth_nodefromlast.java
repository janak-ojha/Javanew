package Linked_list;

public class Del_nth_nodefromlast {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }
    public void Insert(int data)
    {   Node newnode= new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;
    }
    public void Inserend(int data)
    {   Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;

        }
        Node cuerrNode=head;
        while(cuerrNode.next!=null)
        {
            cuerrNode=cuerrNode.next;
        }
        cuerrNode.next=newnode;
        
    }
    public void Printe()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        Node cueeNode=head;
        while (cueeNode!=null) {
            System.out.print(cueeNode.data);
            cueeNode=cueeNode.next;

            
        }
     
        
    }
    public void Del_nth_nodefromlast(int n)
    {
        int size=0;
        Node temp=head;
        while(temp != null)
        {
            size++;
            temp=temp.next;
        }
        if(n>size)
        {
            return;
        }
        if(n==size)
        {
            head=head.next;
            return;
        }
        int step_to_move=size-n;
        Node prev=null;
        Node curNode=head;
        while(step_to_move>0)
        {
            prev=curNode;
            curNode=curNode.next;
            step_to_move--;
        }
        prev.next=curNode.next;

    }
   
   
    public static void main(String[] args) {
        Del_nth_nodefromlast list=new Del_nth_nodefromlast();
        list.Inserend(1);
        list.Inserend(2);
        list.Inserend(3);
        list.Inserend(4);
        list.Printe();
        list.Del_nth_nodefromlast(2);
        System.out.println();
        list.Printe();
        
        
    }
    
}
