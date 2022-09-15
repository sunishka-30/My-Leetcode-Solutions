class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); //to check for duplicates while selecting subsequences
        getCombinations(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }
    
    void getCombinations(int[]candidates, int target,List<List<Integer>> ans, List<Integer>res, int index)
    {  //hashset can be used to get distinct combinations but that will extra log N time
        // thus, try picking subsequences instead of pick and not pick in order to avoid duplicate combinations
        
        if(target==0)
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target)
                break;
            
            res.add(candidates[i]);
            getCombinations(candidates, target-candidates[i],ans,res,i+1);
            res.remove(res.size()-1);
        }
    }
}