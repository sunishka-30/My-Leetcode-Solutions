class Solution {
    //approach 2
    //swap values
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPermutations(nums,ans,0);
        return ans;
    }
    
    void getPermutations(int[]nums, List<List<Integer>> ans, int index)
    {
        if(index==nums.length)
        {
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                res.add(nums[i]);
            }
            
            ans.add(new ArrayList<>(res));
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            swap(i,index,nums);
            getPermutations(nums,ans,index+1);
            swap(i,index,nums);
        }
    }
    
    void swap(int i, int j, int[]nums)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}