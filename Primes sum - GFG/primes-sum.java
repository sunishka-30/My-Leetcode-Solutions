//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int n){
        // code here
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++) {
            
            if (prime[p] == true) {
                
                for (int i = p * p; i < n; i += p)
                    prime[i] = false;
            }
        }
        // ArrayList<Integer> al = new ArrayList<>();
        // for(int i=2;i<=n;i++)
        // {
        //     if(prime[i]==true)
        //     {
        //         al.add(i);
        //     }
        // }
        //  for(int i=0;i<prime.length;i++)
        // System.out.println(prime[i] + " "+i);
        
        int flag = getSum(prime,n);
        if(flag==1)
        return "Yes";
        else
        return "No";
    }
       
       static int getSum(boolean[]prime,int N)
       {
           
    
        for(int i=2;i<=N/2;i++)
        {
            if(prime[i]==true)
            {
                 if(prime[N-i]==true)
                 return 1;
            }
           
        }
        
        return 0;
       }
}