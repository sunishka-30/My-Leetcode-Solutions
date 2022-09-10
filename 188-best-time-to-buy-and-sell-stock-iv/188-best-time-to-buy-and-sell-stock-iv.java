class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int[][][] dp = new int[prices.length][2][k+1];
        for(int i=0 ;i<prices.length ;i++){
            for(int j=0; j<2;j++){
                for(int q=0 ;q<k+1;q++){
                    dp[i][j][q]=-1;
                }
            }
        }
        return maxp(prices , 0 , 1 , k ,dp);
    }
    
    public int maxp(int[] prices , int current , int canbuy , int transcount ,int[][][] dp){
        
        if(current>=prices.length || transcount==0){
            return 0;
        }
        if(dp[current][canbuy][transcount]!=-1){
            return dp[current][canbuy][transcount];
        }
        int idle = maxp(prices ,current+1 , canbuy , transcount, dp);
        int buy=0;
        int sell=0;
        if(canbuy==1){
            buy= -prices[current]+maxp(prices, current+1 , 0 , transcount,dp);
        }
        if(canbuy==0){
            sell= prices[current]+maxp(prices ,current+1 , 1, transcount-1,dp);
        }
        dp[current][canbuy][transcount]=Math.max(idle , Math.max(buy ,sell));
        return Math.max(idle , Math.max(buy ,sell));
    }
}