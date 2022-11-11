//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[]maxL = new int[n];
        int[]maxR = new int[n];
        maxL[0]=arr[0];
        maxR[n-1]=arr[n-1];
        
        int[]water = new int[n];
        long sum = 0;
        
        for(int i=1;i<n;i++)
        maxL[i]=Math.max(maxL[i-1],arr[i]);
        for(int i=n-2;i>=0;i--)
        maxR[i]=Math.max(maxR[i+1],arr[i]);
        
        for(int i=0;i<n;i++)
        {
            water[i]=Math.min(maxL[i],maxR[i])-arr[i];
            sum+=water[i];
        }
        
        return sum;
    } 
}


