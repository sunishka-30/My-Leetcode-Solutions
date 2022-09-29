class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; // for traversing in nums1
        int j=n-1; // for traversing in nums2
        int k=m+n-1; // for inserting element at the position
        
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else
                nums1[k--]=nums2[j--];
            
        }
        while(i>=0)
        {
            nums1[k--]=nums1[i--];
        }
        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }
        
        
    }
}