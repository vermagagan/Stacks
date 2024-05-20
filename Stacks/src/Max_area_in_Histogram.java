import java.util.Stack;
public class Max_area_in_Histogram
{
    public static int maxArea(int heights[])
    {
        int ls[] = new int[heights.length];
        int rs[] = new int[heights.length];
        int maxArea = 0;

        //next smaller for right
        Stack<Integer> s=new Stack<>();
        for(int i=heights.length-1; i>=0; i--)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
                s.pop();

            if(s.isEmpty())
                rs[i] = heights.length;
            else
                rs[i] = s.peek();
            
            s.push(i);
        }

        s=new Stack<>();
        for(int i=0; i<heights.length; i++)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
                s.pop();

            if(s.isEmpty())
                ls[i] = -1;
            else
                ls[i] = s.peek();
            
            s.push(i);
        }

        for(int i=0; i<heights.length; i++)
        {
            int height = heights[i];
            int width = rs[i]-ls[i]-1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String args[])
    {
        int heights[] = {2,1,5,6,2,3};
        System.out.println("Maximum Area of Histogram is: "+maxArea(heights));
    }
}
