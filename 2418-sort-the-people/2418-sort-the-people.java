
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] ans = new String[names.length];
        Map<Integer,String> mp = new HashMap<>();
        for(int i=0;i<names.length;i++)
            mp.put(heights[i],names[i]);
        Arrays.sort(heights);
        int ind=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            ans[ind]=mp.get(heights[i]);
            ind++;
            
        }
        
        return ans;
        
    }
}