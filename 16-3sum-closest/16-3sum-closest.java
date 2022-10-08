class Solution {
    public int threeSumClosest(int[] nums, int target) {
     
        
        int n=nums.length;
     Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){ 
            int j=i+1;
            int k=n-1;
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                if(Math.abs(temp-target) < Math.abs(sum-target) ) sum=temp;
                if(temp>target){
                    k--;                 
                } else if(temp<target){
                    j++;             
                }else return target;
            }
            
        }
        return sum;
    }
}