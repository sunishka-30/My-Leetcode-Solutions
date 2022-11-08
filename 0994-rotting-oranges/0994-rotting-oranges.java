class Pair{
    int first;
    int second;
    int t;
    public Pair(int first, int second, int t)
    {
        this.first=first;
        this.second=second;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][]vis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int tm=0;
        int t=0;
        int cntFresh=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                   vis[i][j]=0; 
                }
                
                if(grid[i][j]==1)
                    cntFresh++;
            }
        }
        int[]delR = {-1,0,1,0};
        int[]delC = {0,1,0,-1};
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int time = q.peek().t;
            tm = Math.max(tm,time);
            q.remove();
            for(int i=0;i<4;i++)
            {
                int nrow = row+delR[i];
                int ncol = col+delC[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
                {
                    q.add(new Pair(nrow,ncol,time+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        
        if(cnt!=cntFresh)
            return -1;
        return tm;
    }
}