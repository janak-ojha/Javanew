package Tree;

public class Bst_deleting_node {
    static class  Node {
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
        if(root.data>val)
        {
        root.left=insert(root.left, val);
        }
        if(root.data<val)
        {
        root.right=insert(root.right, val);
        }
        return root;
        
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
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
        else if(root.data>key)
        {
            return search(root.left, key);
        }
        else{
            return search(root.right, key);

        }
    }
    public static Node deletNode(Node root,int val)
    {
        if(root.data>val)
        {
            root.left=deletNode(root.left, val);
        }
        else if(root.data<val)
        {
            root.right=deletNode(root.right, val);
        }
        else{
            //root.data==value//
            //case 1 for single leaf node//
            if(root.left==null && root.right==null )
            {
                return null;
            } 

            //case2//
            //consist of single line node only left or right node only//
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
           // case 3
           Node is=inordersuccer(root.right);
           root.data=is.data;
           root.right=deletNode(root.right, is.data);

        }
        return root;
    }
    public static Node inordersuccer(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    {

    }
    public static void main(String[] args) {
        int values[]={1,3,2,5,4,6,8,7};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
            
        }
        inorder(root);
        System.out.println();
        deletNode(root, 4);
        inorder(root);
    }
    
}
