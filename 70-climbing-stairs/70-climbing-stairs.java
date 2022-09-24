class Solution {
    public int climbStairs(int n) {
        return solve(0,n,new HashMap<Integer,Integer>());
    }
    
    int solve(int ind, int n, HashMap<Integer,Integer> memo)
    {
        if(ind==n)
            return 1;
        if(ind>n)
            return 0;
        
        int currentKey = ind;
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int oneStep = solve(ind+1,n,memo);
        int twoSteps = solve(ind+2,n,memo);
        
        memo.put(currentKey,oneStep+twoSteps);
        
        return oneStep + twoSteps;
        
    }
}