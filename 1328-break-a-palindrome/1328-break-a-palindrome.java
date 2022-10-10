class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len==1)
            return "";
        
        StringBuilder sb = new StringBuilder(palindrome);
        
        for(int i=0;i<len/2;i++)
        {
            char ch = palindrome.charAt(i);
            if(ch!='a')
            {
                sb.setCharAt(i,'a');
                return sb.toString();
            }
            
                
        }
        
        sb.setCharAt(len-1,'b');
        return sb.toString();
    }
}