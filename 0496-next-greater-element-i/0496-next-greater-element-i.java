class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums2.length;
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                mp.put(nums2[i],-1);
            }
            else if(st.size()>0 && st.peek()>nums2[i])
            {
                mp.put(nums2[i],st.peek());
            }
            else if(st.size()>0 && st.peek()<=nums2[i])
            {
                while(!st.isEmpty()&&st.peek()<=nums2[i])
                    st.pop();
                if(st.isEmpty())
                    mp.put(nums2[i],-1);
                else
                    mp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int[]ar=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ar[i]=mp.get(nums1[i]);
        }
        return ar;
    }
}