//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int l[])
    {
        //code here
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) 
        {
            if(st.size()==0)
            ans.add(-1);
            else if(st.size()>0 && st.peek()<l[i])
            ans.add(st.peek());
            else if(st.size()>0 && st.peek()>=l[i])
            {
                while(st.size()>0 && st.peek()>=l[i])
                {
                    st.pop();
                }
                if(st.size()==0)
                ans.add(-1);
                else
                ans.add(st.peek());
            }
            st.push(l[i]);
        }

        
        return ans;
    } 
    
}