class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans  = new ArrayList<>();
        solve(1,n,k,ans);
        return res;
    }
    void solve(int src, int n, int k, List<Integer> ans)
    {
        if(ans.size()==k)
          res.add(new ArrayList<>(ans));
        
        for(int i=src; i<=n; i++)
        {
            ans.add(i);
            solve(i+1, n, k, ans);
            ans.remove(ans.size()-1);
        }
    }
}