//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] l, int n)
    { 
        // Your code here
        ArrayList<Long> ans = new ArrayList<>();
        Stack<Long> st = new Stack<>();
        for(int i=n-1;i>=0;i--)  //for NGL for(int i=0;i<n;i++) 
        {
            if(st.size()==0)
            ans.add((long)-1);
            else if(st.size()>0 && st.peek()>l[i])
            ans.add(st.peek());
            else if(st.size()>0 && st.peek()<=l[i])
            {
                while(st.size()>0 && st.peek()<=l[i])
                {
                    st.pop();
                }
                if(st.size()==0)
                ans.add((long)-1);
                else
                ans.add(st.peek());
            }
            st.push(l[i]);
        }
         Collections.reverse(ans); //no need to reverse for NGL
        int i=0;
        long ansL[]=new long[ans.size()];
        for(long val:ans)
        {
            ansL[i++]=val;
        }
        return ansL;
    } 
    
    
}