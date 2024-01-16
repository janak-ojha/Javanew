
package Queue;
import java.util.*;

public class Quee_java_collection {
    public static void main(String[] args) {
        Queue<Integer> r=new ArrayDeque<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
