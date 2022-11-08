class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][]ans = image;
        int iniColor = image[sr][sc];
        int[]delR = {-1,0,1,0};
        int[]delC = {0,1,0,-1};
        dfs(sr,sc,ans,image,iniColor,color,delR,delC);
        return ans;
    }
    
    void dfs(int row, int col, int[][]ans,int[][]image,int iniColor,int color, int[] delR, int[] delC )
    {
        int n = image.length;
        int m = image[0].length;
        ans[row][col]=color;
        for(int i=0;i<4;i++)
        {
            int nrow = row+delR[i];
            int ncol = col+delC[i];
            
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && ans[nrow][ncol]!=color && image[nrow][ncol]==iniColor)
            {
                dfs(nrow,ncol,ans,image,iniColor,color,delR,delC);
            }
        }
    }
}