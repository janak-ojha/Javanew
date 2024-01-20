package Tree;
import java.util.*;

public class Preordertree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class Preorder_trees{
        static int idx=-1;
        public static Node builtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=builtree(nodes);
            newnNode.right=builtree(nodes);
            return newnNode;


        }

    }
    public static void preorder( Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
         

    }
    public static void main(String[] args) {
        int nodes[]={1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Preorder_trees tree=new Preorder_trees();
        Node root=tree.builtree(nodes);
        
        preorder(root);
    }
    
}
