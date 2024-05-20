import java.util.ArrayList;
public class Implementation_AL
{
    static ArrayList<Integer> list=new ArrayList<>();

    //isempty
    public Boolean isEmpty()
    {
        return list.size()==0;
    }

    //pop
    public int pop()
    {
        if(list.size()==0)
            return -1;
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    //push
    public void push(int data)
    {
        list.add(data);
    }

    //peek
    public int peek()
    {
        if(list.size()==0)
            return -1;
        
        return list.get(list.size()-1);
    }

    public static void main(String args[])
    {
        Implementation_AL s=new Implementation_AL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
