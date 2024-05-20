import java.util.Stack;
public class ValidParanthesis
{
    public static Boolean validParan(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
                s.push(ch);
            
            else
            {
                if(s.isEmpty())
                    return false;
                else if(ch == ')' && s.peek() == '(')
                    s.pop();
                
                else if(ch == ']' && s.peek() == '[')
                    s.pop();
                
                else if(ch == '}' && s.peek() == '{')
                    s.pop();

                else
                    return false;
            }
        }
        if(s.isEmpty())
            return true;

        else
            return false;
    }
    public static void main(String args[])
    {
        String str="({[]}())";
        System.out.print("Ans: "+validParan(str));
    }
}
