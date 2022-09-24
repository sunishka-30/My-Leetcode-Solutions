class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        solve(s,0,ans,res);
        return ans;
    }
    
    void solve (String s, int ind, List<List<String>> ans, List<String> res )
    {
        if(ind==s.length())
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        
        for(int i=ind;i<s.length();i++)
        {
            if(isPalindrome(s,ind,i))
            {
                res.add(s.substring(ind,i+1));
                solve(s,i+1,ans,res);
                res.remove(res.size()-1);
            }
        }
        
    }
    
    boolean isPalindrome(String s, int i, int j)
    {
        while(i<=j)
        {
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}