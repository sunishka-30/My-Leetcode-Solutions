class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int l=0;
        int r=0;
        int len=0;
        int n = s.length();
        
        while(r<n)
        {
            if(mp.containsKey(s.charAt(r)))
            {
                l = Math.max(l,mp.get(s.charAt(r))+1); 
            }
            
            mp.put(s.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}