package Linked_list;


public class Basis_li {
    Node head;
    private int size;
    Basis_li(){
        this.size=0;
    }
    class Node{
        
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    
     // insertion 
        // begning
    public void add_Beg(String data)
    {   
        Node Newnode=new Node(data);
        if(head==null)
        {
            head=Newnode;
            return;
        }
        Newnode.next=head;
        head=Newnode;
    }

    // insertion at end
    public void add_End(String data)
    {
        Node Newnode=new Node(data);
        if(head==null)
        {
            head=Newnode;
            return;
        }
        Node Currnode=head;
        while(Currnode.next != null)
        {
            Currnode=Currnode.next;
        }
        Currnode.next=Newnode;

        

    }
    // print the nnode
    public void printe()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node Currnode=head;
        while (Currnode!=null) {
            System.out.print(Currnode.data+"->");
            Currnode=Currnode.next;
            
        }
        System.out.println("null");
    }
    // delete at begin
    public void delete_Beg()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        size--;
        head=head.next;
    }
    public void delete_End()
    {
        if (head==null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node Secodlast=head;
        Node lastnode=head.next;
        while(lastnode.next != null)
        {
            lastnode=lastnode.next;
            Secodlast=Secodlast.next;
        }
        Secodlast.next=null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Basis_li List=new Basis_li();
        List.add_Beg("is");
        List.add_Beg("this");
        List.add_End("very");
        List.add_End("imp");
        List.printe();
        List.delete_Beg();
        List.printe();
        List.delete_End();
        List.printe();
         System.out.println(List.getSize());
         List.add_Beg("helli");
         System.out.println(List.getSize());
       

    }
     
    
}
