package Tree;
import java.util.*;

public class Level_order_traversing {
    static class  Node {
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
    static class level_order{
        static int idx=-1;
        public static Node builtNode(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            { 
                return null;

            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=builtNode(nodes);
            newnNode.right=builtNode(nodes);
            return newnNode;


        }
    }
    public static void level(Node root)
    {   if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node cuuNode=q.remove();
            if(cuuNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else{
                System.out.print(cuuNode.data+" ");
                if(cuuNode.left!=null)
                {
                    q.add(cuuNode.left);
                }
                if(cuuNode.right!=null)
                {
                    q.add(cuuNode.right);
                }

            }
            
        }

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        level_order tree=new level_order();
        Node root=tree.builtNode(nodes);
        level(root);

    }
    
}
