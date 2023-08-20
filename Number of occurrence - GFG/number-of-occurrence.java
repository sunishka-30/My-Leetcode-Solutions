//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        
        
        return find(arr, x, 0, n-1);
        
    }
    
    static int find(int[]arr, int x, int l, int r){
         if(l > r){
            return 0;
        }
        
        int mid = (l + r)/2;
        
        if(arr[mid] == x){
            int left = find(arr, x, l, mid-1);
            int right = find(arr, x, mid + 1, r);

            return 1 + left + right;
        }else if(arr[mid] > x){
            return find(arr, x, l, mid-1);
        }else{
            return find(arr, x, mid + 1, r);
    }
    }
}