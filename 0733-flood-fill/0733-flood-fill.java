class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        
        int[][]ans = image;
        int iniColor =  image[sr][sc];
        dfs(image,ans,iniColor,color,sr,sc);
        return image;
    }
    void dfs(int[][]image, int[][]ans, int iniColor, int color, int row, int col)
    {
        ans[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        int[]delR = {-1,0,1,0};
        int[]delC = {0,1,0,-1};
        for(int i=0;i<4;i++)
        {
        
                int nrow = row+delR[i];
                int ncol = col+delC[i];
                if( nrow>=0 && nrow<n && ncol>=0 && ncol<m && ans[nrow][ncol]!=color && image[nrow][ncol]==iniColor)
                {
                    
                    dfs(image,ans,iniColor,color,nrow,ncol);
                }
            
        }
    }
}