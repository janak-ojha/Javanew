package Tree;

public class Max_height_of_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this. data=data;
            this.left=null;
            this.right=null;




        }

    }
    static class Binary_tree{
         static int idx=-1;
         public static Node builttree(int  nodes[])
         {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=builttree(nodes);
            newnNode.right=builttree(nodes);
            return newnNode;
         }

    }
    public static int max_height(Node root){
        if(root==null)
        {
            return 0;
        }
        int leftnodes=max_height(root.left);
        int rightnodes=max_height( root.right);
        int max_hei=Math.max(leftnodes, rightnodes)+1;
        return max_hei;

    }
    public static void main(String[] args) {
        int  nodes []={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        Binary_tree tree= new Binary_tree();
        Node root=tree.builttree(nodes);
        System.out.println("mX_HT_IS :=  "+max_height(root));
    }
    
}
