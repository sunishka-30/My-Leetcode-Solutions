class tuple{
    int first;
    int second;
    int third;
    public tuple(int first, int second, int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int minimumEffortPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        PriorityQueue<tuple> q = new PriorityQueue<tuple>((x,y)->x.first-y.first);
        int[][]dist = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
        q.add(new tuple(0,0,0));
        int[]dr = {-1,0,1,0};
        int[]dc = {0,1,0,-1};
        while(q.size()!=0)
        {
            tuple it = q.peek();
            q.remove();
            int diff=it.first;
            int row=it.second;
            int col=it.third;
            if(row==n-1 && col==m-1)
                return diff;
            for(int i=0;i<4;i++)
            {
                int nrow = row+dr[i];
                int ncol = col+dc[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m)
                {
                    int newEffort = Math.max(Math.abs(grid[row][col]-grid[nrow][ncol]), diff);
                    if(newEffort < dist[nrow][ncol])
                    {
                      dist[nrow][ncol]=newEffort;
                      q.add(new tuple(newEffort, nrow, ncol));
                    }
                }
            }
            
        }
        
        return 0;
        
    }
}