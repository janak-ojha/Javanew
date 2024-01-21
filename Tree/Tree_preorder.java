package Tree;

public class Tree_preorder {
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

    static class  Binarytree {
        static int idx=-1;
        public static Node Builtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;

            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=Builtree(nodes);
            newNode.right=Builtree(nodes);
            return newNode;

        }

    
        
    }
    static class trrinfo
    {
        int ht;
        int diam;
        trrinfo(int ht,int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static trrinfo diameter3(Node root)
    {   if(root==null)
        {
            return new trrinfo(0, 0);
        }
        trrinfo left=diameter3(root.left);
        trrinfo right=diameter3(root.right);
        int myheight=Math.min(left.ht, right.ht);
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam2, diam1),diam3);
        trrinfo myinfo=new trrinfo(myheight, mydiam);
        return myinfo; 
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.Builtree(nodes);
        System.out.println(diameter3(root).diam);
    }
    
}
