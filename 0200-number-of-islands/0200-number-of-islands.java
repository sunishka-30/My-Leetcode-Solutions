class Pair{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][]vis=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    cnt++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        return cnt;
    }
    void bfs(char[][]grid, int[][]vis, int r, int c)
    {
        vis[r][c]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r,c));
        int n=grid.length;
        int m=grid[0].length;
        int[]delR={-1,0,1,0};
        int[]delC={0,1,0,-1};
        
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for(int i=0;i<4;i++)
           {
            int nrow=row+delR[i];
            int ncol=col+delC[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&grid[nrow][ncol]=='1' && vis[nrow][ncol]==0)
            {
                q.add(new Pair(nrow,ncol));
                vis[nrow][ncol]=1;
             }
           }
        }
        
    }
}