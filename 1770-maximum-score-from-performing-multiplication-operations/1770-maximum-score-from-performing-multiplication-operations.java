class Solution {
    
    //greedy fails here as we need check for both start and end and select maximum ans.
    //recursion gives TLE due to exponential complexity as for every multiplier we are having two choices.
    //thus DP is an optimal solution with a T.C of O(N^2) as we are filling the memo array of n*n size.
     // S.C. of 10^6 is used which can be easily allocated.
    
    public int maximumScore(int[] nums, int[] multipliers) {
        int[][]memo = new int[1001][1001]; // reduced by removing end variable and computing it using start
        return calc(nums,multipliers,0,0,memo);
        
    }
    
    int calc(int[]nums, int[]multipliers, int ind, int start,int[][]memo)
    {
        if(ind==multipliers.length)
        {
            return 0;
        }
        if(memo[ind][start]!=0)
            return memo[ind][start];
        
        int end = nums.length - (ind-start) -1;
        
        int l = nums[start]*multipliers[ind] + calc(nums,multipliers,ind+1,start+1,memo);
        int r = nums[end]*multipliers[ind] + calc(nums,multipliers,ind+1,start,memo);
        return memo[ind][start] = Math.max(l,r);
        
    }
}