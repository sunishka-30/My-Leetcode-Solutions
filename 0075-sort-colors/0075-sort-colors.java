class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:
                    swap(low++,mid++,nums);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid,high--,nums);
                    break;
            }
        }
    }
    
    static void swap(int i, int j, int[]a)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}