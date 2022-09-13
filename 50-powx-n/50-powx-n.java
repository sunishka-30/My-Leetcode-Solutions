class Solution {
    //Binary Exponentiation O(log n)
    public double myPow(double x, int n) {
        double ans = 1.0;
        long tempP = n;
        if(tempP<0)
          tempP = -1*tempP;
        
        while(tempP>0)
        {
            if(tempP%2==0)
            {
                x=x*x;
                tempP=tempP/2;
            }
            else
            {
                ans=ans*x;
                tempP--;
            }
        }
        
        if(n<0)
            return (double)1.0/(double)ans;
        return ans;
        
    }
}