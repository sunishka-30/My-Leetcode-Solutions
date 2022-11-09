//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends


class Pair{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Pair> st =  new Stack<>();
        int[]ans=new int[n];
        for(int i=0;i<n;i++)
        {
            if(st.size()==0)
            ans[i]=-1;
            else if(st.size()>0 && st.peek().first>price[i])
            {
                ans[i]=st.peek().second;
            }
            else if(st.size()>0 && st.peek().first<=price[i])
            {
                while(st.size()>0 && st.peek().first<=price[i])
                {
                    st.pop();
                }
                if(st.size()==0)
                ans[i]=-1;
                else{
                    ans[i]=st.peek().second;
                }
            }
            st.push(new Pair(price[i],i));
        }
        
        for(int i=0;i<n;i++)
        {
            ans[i]=i-ans[i];
        }
        return ans;
    }
    
}