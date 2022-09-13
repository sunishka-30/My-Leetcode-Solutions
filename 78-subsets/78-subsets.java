class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        get(nums,ans);
        return ans;
    }
    
    void get(int[]nums, List<List<Integer>>ans)
    {
      
        for(int i=0; i<=(1<<nums.length)-1;i++)
        {  List<Integer> l = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if((i&(1<<j))!=0)
                {
                    l.add(nums[j]);
                }
            }
            ans.add(l);
        }
        
    
        
    }
    
}