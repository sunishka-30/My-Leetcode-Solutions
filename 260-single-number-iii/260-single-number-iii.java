class Solution {
    public int[] singleNumber(int[] nums) {
        int[]ans = new int[2];
        int stXOR=0;
        for(int i:nums)
        {
            stXOR=stXOR^i;
        }
        
        int rsbm = stXOR & -stXOR;
        int x=0;
        int y=0;
       
        for(int i : nums)
        {
            if((i & rsbm) ==0)
            {
                x=x^i;
            }
            else
            {
                y=y^i;
            }
        }
         ans[0]=x;
        ans[1]=y;
        return ans;
    }
}