class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        int ind=0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                cnt++;
                ind=i;

            }
        }
        
        if(cnt==word.length() || cnt==0)
            return true;
        if(cnt==1 && ind==0)
            return true;
        
        return false;
    }
}