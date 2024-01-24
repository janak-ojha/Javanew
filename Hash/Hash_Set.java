package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.size());
        System.out.println(set);
        //searching
        if(set.contains(1))
        {
            System.out.println("set contain");
        }
        if(!set.contains(6))
        {
            System.out.println("does not contain");
        }
        //delete
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("does not contain 1 - we delete");
        }
        //iterator
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        
    }
    
}
