class Pair{
    int r;
    int c;
    int t;
    
    public Pair(int r, int c, int t)
    {
        this.r=r;
        this.c=c;
        this.t=t;
    }
    
}
class Solution {
    //S.C.: N*M
    //T.C.: N*M
    public int orangesRotting(int[][] grid) {
        int n =grid.length;
        int m= grid[0].length;
        Queue<Pair> q = new LinkedList<Pair>();
        int[][]vis = new int[n][m];
        int cntF=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                
                else 
                {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1)
                    cntF++;
            }
        }
        
        int tm=0;
        int []delR = {-1,0,1,0};
        int []delC = {0,1,0,-1};
        int cnt=0;
        
        while(!q.isEmpty())
        {
            int r = q.peek().r;
            int c = q.peek().c;
            int t = q.peek().t;
            
            tm = Math.max(tm,t);
            
            q.remove();
            
            for(int i=0;i<4;i++)
            {
                int nrow = r + delR[i];
                int ncol = c + delC[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        
        if(cnt!=cntF)
            return -1;
        return tm;
    }
}