import java.util.Stack;
public class DuplicateParanthesis
{
    public static Boolean duplicateParan(String str)
    {
        Stack<Character> s=new Stack<>();
        int count;
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch == ')')
            {
                count = 0;
                while(s.peek() != '(')
                {
                    s.pop();
                    count++;
                }
                if(count < 1)
                    return true;
                else
                {
                    s.pop();
                }
            }
            else
                s.push(ch);
        }
        return false;
    }
    public static void main(String args[])
    {
        String str="(((a+(b)))+(c+d))";
        System.out.println("Ans: "+duplicateParan(str));
    }
}
