//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] H = new int[N];
            
            for(int i=0; i<N; i++)
                H[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.removeStudents(H,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int removeStudents(int[] arr, int N) {
        // code here
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        int len=1;
        for(int i=1;i<N;i++)
        {
            if(arr[i]>temp.get(temp.size()-1))
            {
                temp.add(arr[i]);
                len++;
            }
            else{
                int ind = binS(temp,arr[i]);
                temp.set(ind,arr[i]);
            }
        }
        
        return N-temp.size();
    }
    
    static int binS(List<Integer> ans, int key) {
        int low = 0;
        int high = ans.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ans.get(mid) == key) return mid;
            else if (ans.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high+1;
    }
};