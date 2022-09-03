class Solution {

    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        if(n==1)
            ans.add(0);
        dfs(n, k, ans, 0);
        int[]res = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            res[i]=ans.get(i);
        }
        return res;
    }

    void dfs(int n, int k, List<Integer> ans, int currNo) {
        if (n <= 0) {
            ans.add(currNo);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 0 && currNo == 0) {
                continue;
            }
            else if(i!=0 && currNo==0)
            {
                dfs(n-1,k,ans,i);
            }
            else if(Math.abs(currNo%10-i)==k)
            {
                dfs(n-1,k,ans,currNo*10+i);
            }
        }
    }
}
