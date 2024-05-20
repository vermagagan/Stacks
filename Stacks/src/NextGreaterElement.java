import java.util.Stack;
public class NextGreaterElement
{
    public static void nextGreat(int elements[], int ans[])
    {
        Stack<Integer> trackPrev=new Stack<>();
        ans[elements.length-1] = -1;
        trackPrev.push(elements[elements.length-1]);


        for(int i=elements.length-2; i>=0; i--)
        {
            while(!trackPrev.isEmpty() && trackPrev.peek() <= elements[i])
            {
                trackPrev.pop();
            }
            if(trackPrev.isEmpty())
                ans[i] = -1;

            else
                ans[i] = trackPrev.peek();

            trackPrev.push(elements[i]);
        }
    }
    public static void main(String args[])
    {
        int elements[] = {6, 8, 0, 1, 3};
        int ans[] = new int[elements.length];
        nextGreat(elements, ans);
        for(int i=0; i<ans.length; i++)
            System.out.print(ans[i]+" ");
        System.out.println();
    }
}
