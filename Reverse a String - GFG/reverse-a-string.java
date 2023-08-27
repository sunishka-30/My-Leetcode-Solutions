//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//{ Driver Code Starts
//Initial Template for Java



//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char []s = str.toCharArray();
        int j = s.length-1;
        for(int i=0;i<j;i++)
        {
            swap(i,j,s);
            j--;
        }
         return new String(s);
        
    }
    static void swap(int i, int j,char[] s)
    {
        char temp= s[i];
        s[i]=s[j];
        s[j]=temp;
    }

}