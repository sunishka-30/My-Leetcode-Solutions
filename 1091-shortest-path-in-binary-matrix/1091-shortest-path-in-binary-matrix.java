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
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n==1 && grid[0][0]==0)
            return 1;
        int[]source = {0,0};
        int[]destination = {n-1,n-1};
        if(n==1 || grid[0][0]!=0)
            return -1;
        if(source[0]==destination[0] && source[1]==destination[1])
        return 0;
        Queue<tuple> q = new LinkedList<>();
        int[][]dist = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=(int)1e9;
            }
        }
        dist[source[0]][source[1]]=0;
        q.add(new tuple(1,source[0],source[1]));
        
        while(!q.isEmpty())
        {
            tuple it = q.peek();
            q.remove();
            int dis=it.first;
            int row=it.second;
            int col=it.third;
            for(int delR = -1; delR<=1;delR++)
            {
                for(int delC = -1;delC<=1;delC++)
                {
                int nrow = row+delR;
                int ncol = col+delC;
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==0 && 1+dis<dist[nrow][ncol])
                {
                    dist[nrow][ncol]=1+dis;
                    if(nrow==destination[0] && ncol==destination[1])
                    return 1+dis;
                    q.add(new tuple(1+dis, nrow, ncol));
                }
                }
            }
            
        }
        
        return -1;
        
    }
}