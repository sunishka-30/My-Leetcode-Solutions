class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombinations(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }
    
    void getCombinations(int[]candidates, int target, List<List<Integer>> ans,List<Integer>res, int index )
    {
        if(index==candidates.length)
        {
            if(target==0)
                ans.add(new ArrayList<>(res));

            return;
        }
        
    
        if(candidates[index]<=target){
            res.add(candidates[index]);
            getCombinations(candidates,target-candidates[index],ans,res,index);  //pick, repetetion allowed
            res.remove(res.size()-1);
        }
        getCombinations(candidates,target,ans,res,index+1); //not pick
    }
}