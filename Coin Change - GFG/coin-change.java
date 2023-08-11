//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    static long countWays(int[] arr,int ind, int T, long[][] dp){

    if(ind == 0){
        if(T%arr[0]==0)
        return 1;
        else
        return 0;
    }
    
    if(dp[ind][T]!=-1)
        return dp[ind][T];
        
    long notTaken = countWays(arr,ind-1,T,dp);
    
    long taken = 0;
    if(arr[ind] <= T)
        taken = countWays(arr,ind,T-arr[ind],dp);
        
    return dp[ind][T] = notTaken + taken;
}
    public long count(int arr[], int n, int T) {
        // code here.
          long dp[][]=new long[n][T+1];
          for(long row[]: dp)
                Arrays.fill(row,-1);
          return countWays(arr,n-1, T, dp);
    }
}