import java.util.Stack;

public class PalindromeList
{
    public static class Node
    {
        char ch;
        Node next;
        public Node(char ch)
        {
            this.ch = ch;
            this.next = null;
        }
    }
    public static Boolean checkPalindrome(Node newNode)
    {
        Node temp = newNode, remp = newNode;
        Stack<Character> s= new Stack<>();
        while(temp !=  null)
        {
            s.push(temp.ch);
            temp = temp.next;
        }
        while(remp != null)
        {
            if(remp.ch != s.peek())
                return false;
            remp = remp.next;
            s.pop();
        }
        return true;
    }
    public static void printList(Node newNode)
    {
        while(newNode != null)
        {
            System.out.print(newNode.ch+"---------->");
            newNode = newNode.next;
        }
        System.out.print("null");
    }
    public static void main(String args[])
    {
        Node newNode=new Node('A');
        newNode.next = new Node('B');
        newNode.next.next = new Node('C');
        newNode.next.next.next = new Node('D');
        newNode.next.next.next.next = new Node('A');

        printList(newNode);
        System.out.println();
        if(checkPalindrome(newNode))
            System.out.println("yes it is palindrome");

        else
            System.out.println("It is not palindrome");

    }
}
