class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq = new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        
        int[] ans = new int[2];
        for(int i=1;i<freq.length;i++)
        {
          if(freq[i]>1)
              ans[0]=i;
          if(freq[i]==0)
              ans[1]=i;
        }
        
        return ans;
        
    }
}