import java.util.Stack;
public class TrappingRainwater
{
    public static int trappedWater(int heights[])
    {
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int totalwater = 0;
        for(int i=0; i<n; i++)
        {
            while((!s.isEmpty()) && (heights[s.peek()] < heights[i]))
            {
                int pop_height = heights[s.peek()];
                s.pop();
                if(s.isEmpty())
                    break;
                int dist=i-s.peek()-1;
                int minheight = Math.min(heights[s.peek()], heights[i]) - pop_height;
                totalwater += minheight*dist;
            }
            s.push(i);
        }
        return totalwater;
    }
    public static void main(String args[])
    {
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped rain water is: "+trappedWater(heights));
    }
}
