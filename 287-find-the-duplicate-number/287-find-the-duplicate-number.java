class Solution {
    public int findDuplicate(int[] nums) {
        int l =0;
        int h=nums.length-1;
        
        while(l<h)
        {
            int mid = l+(h-l)/2;
            int cnt=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid)
                    cnt++;
            }
            if(cnt<=mid)
                l=mid+1;
            else
                h=mid;
        }
        
        return l;
        
    }
}