class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        possible(ans,ds,arr,1,k,n);
        return ans;
    }
    
    void possible(List<List<Integer>> ans, List<Integer> ds, int[] arr, int ind,int k, int n )
    {
           if(ds.size()==k && n==0)
            {
                ans.add(new ArrayList<>(ds));
                return;
            }
          for(int i=ind;i<=9;i++)
          {
              ds.add(i);
              possible(ans,ds,arr,i+1,k,n-i);
              ds.remove(ds.size()-1);
              
          }
    }
}