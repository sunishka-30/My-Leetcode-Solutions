class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if(jobDifficulty.length<d)
            return -1;
        int dp[][] = new int[d+1][jobDifficulty.length];
        for(int[] n:dp)
        {
            Arrays.fill(n,-1);
        }
        
        return helper(jobDifficulty,dp,d,0);
    }
    
    public int helper(int[] jobDifficulty, int[][] dp, int d, int ind)
    {
        if(d==1)
        {
            int max=0;
            while(ind<jobDifficulty.length)
            {
                max=Math.max(max,jobDifficulty[ind++]);
            }
            return max;
        }
        
        if(dp[d][ind]!=-1)
        {
            return dp[d][ind];
        }
        
        int leftMax=0;
        int res=Integer.MAX_VALUE;
        for(int i=ind;i<jobDifficulty.length-d+1;i++)
        {
            leftMax=Math.max(leftMax,jobDifficulty[i]);
            int rightMax=helper(jobDifficulty,dp,d-1,i+1);
            res=Math.min(res,leftMax+rightMax);
        }
        
        return dp[d][ind]=res;

    }
}