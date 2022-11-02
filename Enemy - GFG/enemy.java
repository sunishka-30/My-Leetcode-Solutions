//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            int n = a[0],m=a[1],k=a[2];
            
            int[][] e = IntMatrix.input(br, a[2], 2);
            
            Solution obj = new Solution();
            int res = obj.largestArea(n,m,k,e);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int largestArea(int n,int m,int k,int[][] enemy) {
        // code here
        ArrayList<Integer> rows=new ArrayList<>();
        
        rows.add(-1);
        for(int[]i:enemy){
            rows.add(i[0]-1);
        }
        rows.add(n);
        Collections.sort(rows);
        
        int maxRow=0;
        for(int i=1;i<rows.size();i++){
            int prev=rows.get(i-1);
            int curr=rows.get(i);
            maxRow=Math.max(maxRow,curr-prev-1);
        }
        
        
        ArrayList<Integer> cols=new ArrayList<>();
        cols.add(-1);
        for(int[]i:enemy){
            cols.add(i[1]-1);
        }
        cols.add(m);
        Collections.sort(cols);
        
        
        int maxCol=0;
        for(int i=1;i<cols.size();i++){
            int prev=cols.get(i-1);
            int curr=cols.get(i);
            maxCol=Math.max(maxCol,curr-prev-1);
        }
        
        // System.out.println(maxRow);
        // System.out.println(maxCol);
        
        return maxRow*maxCol;
        
    }
}