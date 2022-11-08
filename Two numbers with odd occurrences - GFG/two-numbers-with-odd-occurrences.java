//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int[]ans=new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            mp.put(Arr[i],mp.getOrDefault(Arr[i],0)+1);
        }
        int c=0;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                ans[c++]=entry.getKey();
            }
            
        }
        
        for(int i=0;i<1;i++)
        {
            if(ans[i]<ans[i+1])
            {
                swap(i,i+1,ans);
                break;
            }
        }
        return ans;
    }
    
    static void swap(int i, int j, int[]ans)
    {
        int temp = ans[i];
        ans[i]=ans[i+1];
        ans[i+1]=temp;
    }
}