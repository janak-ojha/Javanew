package Stack;

import java.util.ArrayList;

import Stack.LL_imple_stack.stacks;

public class Array_list_stck_imple {
    static class Stacks{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isempty()
        {
            return list.size()==0;
        }
        public static void push(int data)
        {
            list.add(data);
        }
        public static int pop()
        {
            if(isempty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static  int peek()
        {

        
        if(isempty())
        {
            return -1;

        }
        return list.get(list.size()-1);
        
    }

    }
    public static void main(String[] args) {
        Stacks s=new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    
}
