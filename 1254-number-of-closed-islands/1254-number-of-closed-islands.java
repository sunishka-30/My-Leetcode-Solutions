class Solution {
    public int closedIsland(int[][] grid) {
        int cnt=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(grid[i][j]==0)
                {
                    if(dfs(grid,i,j,n,m))
                        cnt++;
                }
            }
        }
        return cnt;
    }
    
    boolean dfs(int[][]grid, int i, int j, int n, int m)
    {
        if(grid[i][j]==-1 || grid[i][j]==1)
            return true;
        if(i==0 || j==0 || i==n-1 || j==m-1)
            return false;
        
        grid[i][j]=-1;
        
        // int[]delR = {-1,0,1,0};
        // int[]delC = {0,1,0,-1};
        
         boolean left = dfs(grid,i,j-1,n,m);
         boolean right = dfs(grid,i,j+1,n,m);
         boolean up = dfs(grid,i-1,j,n,m);
         boolean down = dfs(grid,i+1,j,n,m);
        
        return left && right && up && down;
        
    }
    
    
}