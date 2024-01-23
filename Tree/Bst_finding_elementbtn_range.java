package Tree;

public class Bst_finding_elementbtn_range {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        
        if(val<root.data)
        {
            root.left=insert(root.left, val);
        }
        else
        {
            root.right=insert(root.right, val);
        }
        return root;


    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);

    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
        }
        if(root.data>key)
        {
            return search(root.left, key);
        }
        else
        {
            return search(root.right, key);
        }

    }
    public static Node delNode(Node root,int val)
    {
        if(root.data>val)
        {
            root.left= delNode(root.left, val);
        }
       else if(root.data<val)
        {
            root.right= delNode(root.right, val);
        }
        else {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            Node is = inordee(root.right);
            root.data=is.data;
            root.right=delNode(root.right, is.data);


        }
        return root;

    }
    public static Node inordee(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;

        }
        return root;
    }
    public static void printinrange(Node root,int x,int y)
    {   if(root==null)
        {
            return;
        }
        if(root.data>=x && root.data<=y)
        {
            printinrange(root.left, x, y);
            System.out.print(root.data+" ");
            printinrange(root.right, x, y);
            

        }
        else if(root.data>y)
        {
            printinrange(root.left, x, y);
        }
        else
        {
            printinrange(root.right, x, y);
        }

    }
    public static void main(String[] args) {
        int values[]={1,2,3,5,4,7,9,8,6};
        Node root=null;
        for(int i=0;i<values.length;i++)
        { 
            root=insert(root,values[i]);

        }
        inorder(root);
        System.out.println();
        
        root=delNode(root, 4);
        inorder(root);
        printinrange(root, 4, 9);
    
    }
    
}
