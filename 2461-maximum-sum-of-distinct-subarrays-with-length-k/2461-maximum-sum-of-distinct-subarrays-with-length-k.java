class Solution {
    public long maximumSubarraySum(int[] ar, int k) {
        long sum = 0;
        long max=0;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(j<ar.length)
        {
            mp.put(ar[j],mp.getOrDefault(ar[j],0)+1);
            sum+=ar[j];
            
            if(j-i+1==k)
            {
                if(mp.size()==k)
                max=Math.max(max,sum);
                
                sum=sum-ar[i];
                mp.put(ar[i],mp.get(ar[i])-1);
                if(mp.get(ar[i])==0)
                    mp.remove(ar[i]);
                i++;
            }
            j++;
        }
        
        return max;
    }
}