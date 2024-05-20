import java.util.Stack;

public class Stock_Span
{
    public static void stockSpan(int stocks[], int span[])
    {
        Stack<Integer> trackPrevidx=new Stack<>();
        span[0] = 1;
        trackPrevidx.push(0);

        for(int i=1; i<stocks.length; i++)
        {
            int currprice = stocks[i];
            while(!trackPrevidx.isEmpty() && currprice >= stocks[trackPrevidx.peek()])
                trackPrevidx.pop();
            

            if(trackPrevidx.isEmpty())
                span[i] = i+1;
            
            else
            {
                int prevhigh = trackPrevidx.peek();
                span[i] = i-prevhigh;
                trackPrevidx.push(i);
            }
        }
    }
    public static void main(String args[])
    {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0; i<span.length; i++)
            System.out.print(span[i]+" ");
        System.out.println();
    }
}
