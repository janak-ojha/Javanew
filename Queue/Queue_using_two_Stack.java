package Queue;
import java.util.*;

import java.util.Stack;

public class Queue_using_two_Stack {
    static class Queueue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();
        public static boolean isempty()
        {
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public static int remove()
        {
            if(isempty())
            {
                System.out.println("empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek()
        {
            if(isempty())
            {
                System.out.println("ismempty");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        Queueue q=new Queueue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isempty()) 
            {
                System.out.println(q.peek());
                q.remove();
            }
            
        
    }
    
}
