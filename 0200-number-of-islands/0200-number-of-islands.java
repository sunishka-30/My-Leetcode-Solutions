class Pair{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt=0;
        int[][]vis = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    cnt++;
                    bfs(i,j,grid,vis);
                }
            }
        return cnt;
    }
    
    void bfs(int ro, int co, char[][]grid, int[][]vis)
    {
        int n = grid.length;
        int m = grid[0].length;
        vis[ro][co]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro,co));
        
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            
            q.remove();
            
            for(int delR = -1; delR<=1;delR++)
            {
                for(int delC = -1;delC<=1;delC++)
                {
                     if ((delR == -1 && delC == -1) || (delR == 1 && delC == -1) || (delR == -1 && delC == 1) || (delR == 1 && delC == 1)) continue;
                    int nrow = row+delR;
                    int ncol = col+delC;
                    
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