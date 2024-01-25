package Hash;

import java.util.LinkedList;

public class Hash_map_code {
    static class HashMap<K,V>
    {
        private class Node{
            K key;
            V value;
            public Node(K key,V value)
            {
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        public HashMap()
        {
            this.n=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int Hashfunction(K key)
        {
            int bi=key.hashCode();
            return Math.abs(bi)%N;

        }
        private int searchinall(K key,int bi)
        {
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++)
            {
                if(ll.get(i).key==key)
                {
                    return i;
                }

            }
            return -1;
        }
        private void rehash()
        {
            LinkedList<Node> oldbucket[]=buckets;
            buckets=new LinkedList(N*2);
            for(int i=0;i<N*2;i++)
            {
                buckets[i]=new LinkedList<>();

            }
            for(int i=0;i<oldbucket.length;i++)
            {
                LinkedList<Node> ll=oldbucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(i);
                    put(node.key, node.value);
                }
            }

        }
        public void put(K key,V value)
        {
            int bi=Hashfunction(key);
            int di=searchinall(key,bi);

            if(di==-1)//if key doesnot exist add new key
            {
                buckets[bi].add(new Node(key, value));
                n++;

            }//if exist then change value of existing key
            else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0)
            {
              rehash();
            }



        }
        public V get(K key)
    {
        int bi=Hashfunction(key);
        int di=searchinall(key, bi);
        if(di==-1)
        {
            return null;
        }
        else{
            Node node=buckets[bi].get(di);
            return node.value;
        }
    }
    public boolean containskey(K key)
    {
        int bi=Hashfunction(key);
        int di=searchinall(key,bi);
        if(di==-1)
        {
            return false;
        }
        else{
            return true;

        }
    }
    }
    
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("nepal", 10);
        map.put("india", 20);
        map.put("china", 30);

    }
}
