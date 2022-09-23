class Solution {
    public int concatenatedBinary(int n) {
        int m = 1000000007;
        int ans = 0;
        
        for(int i=1;i<=n;i++)
        {
            String s = Integer.toBinaryString(i);
            for(char ch : s.toCharArray())
            {
                int val = (ch=='0')?0:1;
                ans = ((ans*2)%m + val)%m;
            }
        }
        return ans;
    }
}
