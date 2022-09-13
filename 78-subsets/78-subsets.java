class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> l = new ArrayList<>();
        get(nums,l,ans,0);
        return ans;
    }
    void get(int[]nums,List<Integer> l, List<List<Integer>> ans,int start )
    {
       
        ans.add(new ArrayList<>(l));
        
        for(int i=start;i<nums.length;i++)
        {
            l.add(nums[i]);
            get(nums,l,ans,i+1);
            l.remove(l.size()-1);
        }
    }
}