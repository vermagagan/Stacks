import java.util.Stack;
public class Reverse_String
{
    public static String reverseString(String str)
    {
        Stack<Character> s=new Stack<>();
        if(str.length() == 0)
            return "";
        
        int idx=0;
        while(idx < str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newStr=new StringBuilder("");
        while(!s.isEmpty())
        {
            char ch = s.pop();
            newStr.append(ch);
        }

        return newStr.toString();
    }
    public static void main(String[] args)
    {
        String str="abc";
        System.out.println("Reverse of the sting is: "+reverseString(str));
    }
}
