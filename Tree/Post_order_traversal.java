package Tree;
import java.util.*;

public class Post_order_traversal {
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
    static class Postorder{
        static int idx=-1;
        public static Node buildstree(int nodes [])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnNode= new Node(nodes[idx]);
            newnNode.left=buildstree(nodes);
            newnNode.right=buildstree(nodes);
            return newnNode;
        } 

    }
    public static void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data+" ");
        Inorder(root.right);
    }
    public static  void Postorders(Node root)
    {
        if(root == null)
        {
            return;
        }
        Postorders(root.left);
        Postorders(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Postorder tree=new Postorder();
        Node root=tree.buildstree(nodes);
        Postorders(root);

    }
    
}
