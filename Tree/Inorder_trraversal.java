package Tree;

public class Inorder_trraversal {
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
    static class Inortree{
        static int idx=-1;
        public static Node Builtrees(int nodes[])
        { idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=Builtrees(nodes);
            newNode.right=Builtrees(nodes);
            return newNode;

        }

    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+"");

        Inorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Inortree tree=new Inortree();
        Node root=tree.Builtrees(nodes);
        Inorder(root);

    }
    
}
