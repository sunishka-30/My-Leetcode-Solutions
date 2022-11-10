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
        int xor=0;
        for(int i=0;i<N;i++)
        {
            xor=xor^Arr[i];
        }
        int ar[]=new int[2];
        int set = xor & ~(xor-1);
        int s=0;
        int c=0;
        for(int i=0;i<N;i++)
        {
            if((set&Arr[i])>0)
            {
                c=c^Arr[i];
            }
            else
            s=s^Arr[i];
        }
        ar[0]=c;
        ar[1]=s;
        if(c>=s)
        return ar;
        else
        {
            int temp=ar[0];
            ar[0]=ar[1];
            ar[1]=temp;
            return ar;
        }
        
    }
}