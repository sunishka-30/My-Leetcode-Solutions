class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        if(len<=1)
            return 0;
        int cnt=0;
        for(int i=0;i<len;i++)
        {
            int prod=nums[i];
            if(prod<k)
                cnt++;
            for(int j=i+1;j<len && prod<k;j++)
            {
                prod*=nums[j];
                if(prod<k)
                    cnt++;
            }
        }
        return cnt;
    }
}