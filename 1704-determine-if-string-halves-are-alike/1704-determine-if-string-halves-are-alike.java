class Solution {
    public boolean halvesAreAlike(String s) {
        String ss = s.toLowerCase();
        int mid=s.length()/2;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<mid;i++)
        {
            if(ss.charAt(i)=='a' || ss.charAt(i)=='e' || ss.charAt(i)=='i' || ss.charAt(i)=='o' || ss.charAt(i)=='u' )
                cnt1++;
        }
        for(int i=mid;i<s.length();i++)
        {
            if(ss.charAt(i)=='a' || ss.charAt(i)=='e' || ss.charAt(i)=='i' || ss.charAt(i)=='o' || ss.charAt(i)=='u' )
                cnt2++;
        }
        return cnt1==cnt2;
        
    }
}