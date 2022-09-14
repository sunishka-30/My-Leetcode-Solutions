class Solution {
    Map<String,Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s))
            return true;
        if(memo.containsKey(s))
           return memo.get(s);
        for(int i=0;i<s.length();i++)
        {
            if(wordDict.contains(s.substring(0,i)) && wordBreak(s.substring(i),wordDict))
            {
                memo.put(s,true);
                return true;
            }
                
        }
        memo.put(s,false);
        return false;
    }
}