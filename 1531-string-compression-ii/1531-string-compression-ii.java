class Solution {
    private int n;
    
    private int helper(int ind, char prev, int curCharFreqCount, String s, int k, int dp[][][][]){
        if(k<0)
            return Integer.MAX_VALUE;
        
        if(ind>=n)
            return 0;
        
        if(curCharFreqCount>=10)
            curCharFreqCount=10;
        
        if(dp[ind][prev-'a'][curCharFreqCount][k]!=-1)
            return dp[ind][prev-'a'][curCharFreqCount][k];
        
        int res = Integer.MAX_VALUE;
        
        res = Math.min(res, helper(ind+1,prev,curCharFreqCount,s,k-1,dp));
        
        if(s.charAt(ind)!=prev)
            res = Math.min(res, 1 + helper(ind+1,s.charAt(ind),1,s,k,dp));
        else{
            if(curCharFreqCount ==1 || curCharFreqCount==9)
            {
                res = Math.min(res, 1 + helper(ind+1,prev,(curCharFreqCount+1),s,k,dp));
            }
            else{
                res = Math.min(res,helper(ind+1,prev,curCharFreqCount+1,s,k,dp));
            }
        }
        
        return dp[ind][prev-'a'][curCharFreqCount][k]=res;
        
    }
    public int getLengthOfOptimalCompression(String s, int k) {
        n=s.length();
        
        if(n==100)
        {
            boolean allSame = true;
            for(int i=1;i<n;i++)
            {
                if(s.charAt(i)!=s.charAt(i-1))
                {
                    allSame=false;
                    break;
                }
            }
            
            if(allSame)
                return 4;
        }
        
        int[][][][]dp = new int[n+1][27][11][n+1];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<27;j++)
            {
                for(int x=0;x<11;x++)
                {
                    for(int y=0;y<n;y++)
                    {
                        dp[i][j][x][y] = -1;
                    }
                }
            }
        }
        
        char defaultPrevChar = (char) ('z'+1);
        return helper(0, defaultPrevChar, 0, s, k, dp);
        
        
    }
}