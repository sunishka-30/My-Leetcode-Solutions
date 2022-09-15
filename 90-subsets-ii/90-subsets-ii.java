class Solution {
    //same intuition as combination sum 2
    public void subsets (int index, int[]nums, List<Integer>ds, List<List<Integer>> finalList )
    {
        finalList.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            subsets(i+1,nums,ds,finalList);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        subsets(0,nums,new ArrayList<>(),finalList);
        return finalList;
        
    }
}