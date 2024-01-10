package Linked_list;

import java.util.List;

public class Cycle_loop_in_ll {
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
    public  void Insert_At_beg(int data)
    {  Node newnNode=new Node(data);
        if(head ==null)
        {  
             head=newnNode;
             return;


        }
        newnNode.next=head;
        head=newnNode;
    }
    public void Insert_At_end(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;

        }
        currNode.next=newNode;
        
    }
    public void printe()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data);
            currNode=currNode.next;
        }

    }
    public void del_atbeg()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        head=head.next;
    }
    public void del_At_end()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        if(head.next==null)
        {
            head=null;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null)
        {
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public void reverse()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prev=null;
        Node curr=head.next;
        while(curr!=null)
        {
            Node newnNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnNode;
        }
        head.next=null;
        head=prev;

    }
    public boolean Hascycle()
    {
        if(head==null)
        {
            return true;
        }
        Node hare=head;
        Node turtle=head;
        while (hare!=null && hare.next!=null) {
            hare=hare.next.next;
            turtle=turtle.next;
            if (hare==turtle) 
            { 
                return true;
                
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Cycle_loop_in_ll list=new Cycle_loop_in_ll();
        list.Insert_At_end(1);
        list.Insert_At_end(2);
        list.Insert_At_end(1);
        list.Insert_At_end(2);
        list.printe();
        
        
        System.out.println(list.Hascycle());
    }
}
