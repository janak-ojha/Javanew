package Tree;

public class Sumof_treenode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }
     static class count_node {
        static int idx = -1;
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
    public static int suntree(Node root)
    { 
        if(root==null)
        {
            return 0;
        }
        int leftnodes=suntree( root.left);
        int rightnodes=suntree(root.right);
        return leftnodes+rightnodes+root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        count_node  tree=new count_node();
        Node root= tree.builtree(nodes);
        System.out.println(suntree(root));


    }
    
}
