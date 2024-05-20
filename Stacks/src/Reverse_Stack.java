import java.util.Stack;
public class Reverse_Stack
{
    public static void pushatBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int Top = s.pop();
        pushatBottom(s, data);
        s.push(Top);
    }
    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
        
        int top = s.pop();
        reverseStack(s);
        pushatBottom(s,top);
    }
    public static void printStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> m=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        
        
        reverseStack(s);
        printStack(s);
        
    }
}
