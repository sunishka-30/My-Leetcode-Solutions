//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        
        int n = grid.length;
        int m = grid[0].length;
        int[][]vis = new int[n][m];
        HashSet<ArrayList<String>> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                {
                    ArrayList<String> al = new ArrayList<>();
                    dfs(i,j,vis,grid,al,i,j);
                    hs.add(al);
                }
            }
        }
        
        return hs.size();
    }
    
    static void dfs(int row, int col, int[][]vis, int[][]grid, ArrayList<String>al, int baseR, int baseC )
    {
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col]=1;
        al.add(toString(row-baseR, col-baseC));
        int[]delR = {-1,0,1,0};
        int[]delC = {0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nrow = row+delR[i];
            int ncol = col+delC[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
            {
                dfs(nrow,ncol,vis,grid,al,baseR,baseC);
            }
        }
    }
    
    static String toString(int r, int c)
    {
        return Integer.toString(r)+" "+Integer.toString(c);
    }
}
