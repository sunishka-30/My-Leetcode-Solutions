class Solution {
    int m=(int)1e9+7;
    public int countGoodNumbers(long n) {
        
        long first = (n%2==0?(n/2):(n/2)+1);
        long second = n/2;
        
        long mul5 = power(5,first)%m;
        long mul4 = power(4,second)%m;
        
        long ans = 1;
        ans=(ans*mul5)%m;
        ans=(second!=0)?(ans*mul4)%m:ans;
        return (int)ans%m;
    }
    
    long power(long x, long n)
    {
        long res=1;
        while(n>0)
        {
            if(n%2==0)
            {   
                x=(x*x)%m;
                n=n/2;
            }
            else{
                res=(res*x)%m;
                n--;
            }
        }
        return res;
    }
}