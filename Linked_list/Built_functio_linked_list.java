package Linked_list;
import java.util.*;

public class Built_functio_linked_list {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("hello");
        list.addFirst("how");
        System.out.println(list);
        list.addLast("hyy");
        list.add("you");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
    
}
