package Linked_list;

public class Listlink {
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
    public void Insete(int data)
    {   Node Newnode=new Node(data);
        if(head==null)
        { head=Newnode;
            return;

        }
        Newnode.next=head;
        head=Newnode;
    }
    public void Inserteen(int data)
    {
        Node Newnode=new Node(data);
        if(head==null)
        {
            head= Newnode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
         }
         currNode.next=Newnode;

    }
    public void Printe()
    {
        if(head==null)
        {
            System.out.println("lists is empty");
        }
        Node cuNode=head;
        while(cuNode!=null)
        { 
            System.out.print(cuNode.data+"->");
            cuNode=cuNode.next;
        }
        System.out.println("null");
    }
    public void del_atbeg()
    {
        if(head==null)
        {
            System.out.println("list ia empty");
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
        while(last != null)
        {
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node prevnode=head;
        Node curNode=head.next;
        while(curNode !=null)
        {
            Node nextNode=curNode.next;
            curNode.next=prevnode;

            //update
            prevnode=curNode;
            curNode=nextNode;
        }
        head.next=null;
        head=prevnode;
    }
    
    public static void main(String[] args) {
        Listlink liste=new Listlink();
        liste.Inserteen(1);
        liste.Inserteen(2);
        liste.Inserteen(3);
        liste.Inserteen(4);
        liste.Printe();
        liste.reverse();
        liste.Printe();
        

        
    }

}
