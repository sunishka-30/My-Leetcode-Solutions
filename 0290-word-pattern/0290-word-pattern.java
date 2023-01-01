class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]words = s.split(" ");
        HashMap<Character,String> mp = new HashMap<>();
        HashMap<String,Boolean> used = new HashMap<>();
        
        if(pattern.length()!=words.length)
            return false;
        
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            if(mp.containsKey(ch)==false)
            {
                if(used.containsKey(words[i])==true)
                    return false;
                else{
                    mp.put(ch,words[i]);
                    used.put(words[i],true);
                }
            }
            else{
                String mwith = mp.get(ch);
                if(mwith.equals(words[i]) == false) return false;
            }
        }
        return true;
    }
}