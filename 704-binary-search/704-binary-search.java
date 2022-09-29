class Solution {
    public int search(int[] arr, int target) {
        int l =0;
        int h= arr.length-1;
        
        while(l<=h)
        {
            int mid = l + (h-l)/2;
            if(arr[mid] == target )
                return mid;
            else if(target<arr[mid])
            {
                h = mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
        
    }
}