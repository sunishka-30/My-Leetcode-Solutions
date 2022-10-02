class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        
        return maxWays(d,f,target,new HashMap<String,Integer>());
        
       
        
    }
    public int maxWays(int dice, int face, int target,HashMap<String,Integer>memo)
    {
        
        if(dice<=0 && target !=0)
        {
            return 0;
        }
        
        if(dice==0 && target ==0)
            return 1;
        
        String currentKey = Integer.toString(dice)+"_"+Integer.toString(target);
        if(memo.containsKey(currentKey))
        {
            return memo.get(currentKey);
        }
       int ans=0;
       
       for(int i=1;i<=face;i++)
        {
            int tempAns=maxWays(dice-1,face,target-i,memo);
          
            ans=(ans%1000000007+tempAns%1000000007)%1000000007;
            
         
        
        }
         memo.put(currentKey,ans);
        return ans;
        
        
         
       
        
    }
}