class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st =new HashSet<Integer>();
        for(int n:nums)
        {
            if(st.contains(n))
            {
                return true;
            }
            st.add(n);
        }
        return false;
    }
}
