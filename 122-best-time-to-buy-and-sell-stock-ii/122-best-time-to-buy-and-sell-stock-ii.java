class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int i=0 ;i<prices.length ;i++){
            for(int j=0; j<2;j++){
                
                    dp[i][j]=-1;
                
            }
        }
        return maxp(prices , 0 , 1 ,dp);
    }
    
    public int maxp(int[] prices , int current , int canbuy ,int[][] dp){
        
        if(current>=prices.length){
            return 0;
        }
        if(dp[current][canbuy]!=-1){
            return dp[current][canbuy];
        }
        int idle = maxp(prices ,current+1 , canbuy , dp);
        int buy=0;
        int sell=0;
        if(canbuy==1){
            buy= -prices[current]+maxp(prices, current+1 , 0 ,dp);
        }
        if(canbuy==0){
            sell= prices[current]+maxp(prices ,current+1 , 1,dp);
        }
        dp[current][canbuy]=Math.max(idle , Math.max(buy ,sell));
        return Math.max(idle , Math.max(buy ,sell));

        
    }
}