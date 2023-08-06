//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends




//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans = new ArrayList<>();
        permute(0,S,ans);
        Collections.sort(ans);
        return ans;
    }
	static void permute(int index, String S, ArrayList<String> ans )
	{
	    if(index==S.length())
	    {
	        ans.add(S);
	    }
	    for(int i=index;i<S.length();i++)
	    {
	        S=swap(S,index,i);
	        permute(index+1,S,ans);
	        S=swap(S,index,i);
	    }
	}
	static String swap(String S, int index, int i)
	{
	    char temp;
	    char[] chArr = S.toCharArray();
	    temp=chArr[index];
	    chArr[index]=chArr[i];
	    chArr[i]=temp;
	    return String.valueOf(chArr);
	}
}
