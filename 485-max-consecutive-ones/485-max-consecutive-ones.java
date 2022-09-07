class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {max=Math.max(max,cnt);
                cnt=0;}
            else if(i==nums.length-1)
            {
                if(nums[i]==1)
                {
                    cnt++;
                    max=Math.max(max,cnt);
                }
            }
            else
                cnt++;
        }
        return max;
    }
}