package Linked_list;

import Linked_list.Basis_li.Node;

public class Ll_is_palindrome_ornot {
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
    public void Insert_beg(int data)
    {   Node newNode=new Node(data);
        if(head== null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void Insert_At_end(int data)
    {  Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;

    }
    public void Printe()
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;

        }
        Node cuNode=head;
        while (cuNode!=null) {
            System.out.print(cuNode.data);
            cuNode=cuNode.next;
            
        }
    }
     public Node reverse(Node head)
        {
            Node prev=null;
            Node curr=head;
            while(curr != null)
            {
                 Node next=curr.next;
                 curr.next=prev;
                 prev=curr;
                 curr=next;
            }
            return prev;
        }
        public Node find_middle(Node head)
        {
            Node hare=head;
            Node turtle=head;
            while(hare.next!=null && hare.next.next!=null)
            {
               hare=hare.next.next;
              turtle=turtle.next;

            }
            return turtle;
        }
    public boolean Ispalindrome()
    {
        if (head==null || head.next==null) {
            return true;
            
        }
       
        Node middNode=find_middle(head);//first half end()
        Node Secon_half_start=reverse(middNode.next);
        Node first_half_startNode=head;
        while (Secon_half_start!=null) {
            if(first_half_startNode.data!=Secon_half_start.data)
            {
                return false;
            }
            first_half_startNode=first_half_startNode.next;
            Secon_half_start=Secon_half_start.next;
            
        }
        return true;
        
        

    }
    public static void main(String[] args) {
        Ll_is_palindrome_ornot list=new Ll_is_palindrome_ornot();
        list.Insert_At_end(1);
        list.Insert_At_end(2);
        list.Insert_At_end(2);
        list.Insert_At_end(1);
        list.Printe();
        System.out.println("is_palendrome"+list.Ispalindrome());
    }
    
}
