class Solution {
    public int[] findOriginalArray(int[] changed) {
        int len = changed.length;
        int[]ans = new int[len/2];
        if(len%2==1)
            return new int[]{};
        
        int[] freq = new int[200005]; //max value
        for(int val : changed)
        {
            freq[val]+=1; //store frequency
        }
        int j=0;
        for(int i=0;i<200005;i++)
        {
            if(freq[i]>0) //if value is present check for doubled value
            {
                freq[i]-=1;
                if(freq[i*2]>0) //if doubled value present, add original value to ans
                {
                    freq[i*2]-=1;
                    ans[j++]=i--;
                }
            
                else{  //else return empty array
                return new int[]{};
                }
            }
        }
        
       return ans;
    }
}