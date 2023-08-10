//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
         int n=s1.length();
    int m=s2.length();
    
    // Base Case is covered as we have initialized the prev and cur to 0.
    int prev[]=new int[m+1];
    int cur[]=new int[m+1];
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
                cur[ind2] = 1 + prev[ind2-1];
            else
                cur[ind2] = 0 + Math.max(prev[ind2],cur[ind2-1]);
        }
        prev=(int[])(cur.clone());
    }
    
    return prev[m];
    }
    
}