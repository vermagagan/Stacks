import java.util.Stack;
public class Push_at_bottom
{
    public static void pushatBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatBottom(s, data);
        s.push(top);
    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        pushatBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
