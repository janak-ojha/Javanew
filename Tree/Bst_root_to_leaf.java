package Tree;


import java.util.ArrayList;

public class Bst_root_to_leaf {
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
    else{
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
   public static boolean search(Node root,int val)
   {
     if(root==null)
     {
        return false;
     }
     if(root.data==val)
     {
        return true;

     }
     if(root.data>val)
     {
        return search(root.left, val);
     }
     else
     {
        return search(root.right, val);
     }
     
      
   }
   public static Node deletNode(Node root,int val)
   {
    if(root.data>val)
    {
        root.left= deletNode(root.left, val);
    }
    else if(root.data<val)
    {
        root.right=deletNode(root.right, val);
    }
    else{
        if(root.right==null && root.left==null)
        {
            return null;
        }
        if(root.right==null)
        {
            return root.right;
        }
        if(root.left==null)
        {
            return root.right;
        }
        Node is=inordersccceder(root.right);
        root.data=is.data;
        root.right=deletNode(root.right, is.data);
        
    }
    return root;
   }
   public static Node inordersccceder(Node root)
   {
    while(root.left!=null)
    {
        root=root.left;
    }
      return root;
   }
   public static void printpath(ArrayList<Integer> path)
   {
    for(int i=0;i<path.size();i++)
    {
        System.out.print(path.get(i)+"->");
    }
    System.out.println();
   }
   public static void printroot2leaf(Node root,ArrayList<Integer> path)
   { if(root==null)
    {
        return ;
    }
    path.add(root.data);
    if(root.left == null && root.right==null)
    {
        printpath(path);
    }
    else{
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
    }
    path.remove(path.size()-1);
   }
    public static void main(String[] args) {
        int values[]={1,4,2,3,5,7,6,8,9};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        root=deletNode(root, 4);
        inorder(root);
        System.out.println();
        printroot2leaf(root,new ArrayList<>());

    }
    
}
