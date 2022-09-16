class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] mark = new boolean[nums.length];
        getPermutations(nums,ans,ds,mark);
        return ans;
    }
    
    void getPermutations(int[]nums, List<List<Integer>> ans, List<Integer>ds, boolean[]mark)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!mark[i])
            {
                mark[i]=true;
                ds.add(nums[i]);
                getPermutations(nums,ans,ds,mark);
                ds.remove(ds.size()-1);
                mark[i]=false;
            }
        }
    }
}