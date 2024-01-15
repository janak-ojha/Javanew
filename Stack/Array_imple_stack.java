package Stack;

public class Array_imple_stack {
    private int [] stack;
    private int top;
    private int size;
    public Array_imple_stack(int size)
    {
        this.size=size;
        this.stack=new int[size];
        this.top=-1;

    }
    public void push(int element)
    {  
        if(top==size-1)
        {
            System.out.println("stack is overflow");
            return;
        }
        
        stack[++top]=element;


    }
    public boolean isempty()
    {
        return top==-1;
    }
    public int pop()
    {
        if(isempty())
        {
            System.out.println("stack is under flow");
            return -1;
        }
        return stack[top--];

    }
    public int peek()
    {
        if(isempty())
        {
            System.out.println("stack is empty");
        }
        return stack[top];
    }
    public static void main(String[] args) {
        Array_imple_stack stack=new Array_imple_stack(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        while (!stack.isempty()) {
            System.out.println(stack.pop());
            
        }
        System.out.println(stack.pop());
    }
    
}
