package Tree;

public class Count_of_nodes_of_tree {
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
    static class Count_tree{
        static  int idx=-1;
        public static Node Builtrees(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)

            {
                return null;
            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=Builtrees(nodes);
            newnNode.right=Builtrees(nodes);
            return newnNode;
        }
    }

        public static int count_node(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftnodes=count_node(root.left);
            int rightnodes=count_node(root.right);
            return leftnodes+rightnodes+1;
        }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Count_tree tree= new Count_tree();
        Node root=tree.Builtrees(nodes);
        System.out.println(count_node(root));
    }
    
}
