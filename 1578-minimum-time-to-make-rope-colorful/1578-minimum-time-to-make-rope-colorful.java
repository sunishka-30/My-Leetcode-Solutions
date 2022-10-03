class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int start = 0;
        int end= 0;
        int n = colors.length();
        while(start<n && end<n)
        {
            int maxTime=0;
            int groupSum=0;
            while(end<n && colors.charAt(start)==colors.charAt(end))
            {
                maxTime = Math.max(maxTime,neededTime[end]);
                groupSum += neededTime[end];
                end++;
            }
            
            totalTime += (groupSum-maxTime);
            start=end;
        }
        
        return totalTime;
        
    }
}