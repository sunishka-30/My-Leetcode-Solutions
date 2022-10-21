//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Pair{
    int first;
    int second;
    public Pair(int first, int second )
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]=='1')
                {
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    
    static void bfs(int ro, int co, int[][]vis, char[][]grid)
    {
        vis[ro][co]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro,co));
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            
            q.remove();
            
            for(int delR = -1; delR<=1; delR++)
            {
                for(int delC = -1; delC<=1;delC++)
                {
                    int nrow = delR + row;
                    int ncol = delC + col;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0)
                    {
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
        
    }
}