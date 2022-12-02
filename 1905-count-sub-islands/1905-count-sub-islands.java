class Solution {
    boolean flag=true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length, n = grid2[0].length, count = 0;
        int[][]visited = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid2[i][j]==1){
                    if(visited[i][j]==0){
                        flag = true;
                        dfs(i,j,m,n,grid1,grid2,visited);
                        if(flag==true) count++;
                    }
                }
            }
        }
        return count;
    }
    void dfs(int x, int y, int m, int n, int[][]grid1, int[][]grid2, int[][]visited){
        if(x<0 || x>=m || y<0 || y>=n || visited[x][y]==1 || grid2[x][y]==0) return;
    
        
        if(grid1[x][y] == 0) flag = false;
        
        visited[x][y] = 1;
        dfs(x-1,y,m,n,grid1,grid2,visited);
        dfs(x+1,y,m,n,grid1,grid2,visited);
        dfs(x,y-1,m,n,grid1,grid2,visited);
        dfs(x,y+1,m,n,grid1,grid2,visited);
    }
}