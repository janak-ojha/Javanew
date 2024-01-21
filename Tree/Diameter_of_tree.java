package Tree;

public class Diameter_of_tree {
    static class Node {
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
    static class DIA{
        static int idx=-1;
        public static Node builtNode(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnoNode=new Node(nodes[idx]);
            newnoNode.left=builtNode(nodes);
            newnoNode.right=builtNode(nodes);
            return newnoNode;
        }
    }
    public static int max_hei(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftnodes=max_hei( root.left);
        int rightnodes=max_hei(root.right);
        int max_height=Math.min(leftnodes, rightnodes)+1;
        return max_height;


    }
    public static int diamtre(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int diam1=diamtre(root.left);
        int diam2=diamtre(root.right);
        int diam3=max_hei(root.left)+max_hei(root.right)+1;
        return Math.max(diam3,Math.min(diam2, diam1));
    }
    public static void main(String[] args) {
        int nodes []={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        DIA tree=new DIA();
        Node root=tree.builtNode(nodes);
        System.out.println(diamtre(root));
    }
    
}
