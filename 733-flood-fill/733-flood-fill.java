class Solution {

    //T.C.: O(N*M)
    //S.C.: O(N*M) + O(N*M)
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int iniColor = image[sr][sc];
        int[] delRow = { -1, 0, 1, 0 };
        int[] delCol = { 0, 1, 0, -1 };
        dfs(sr, sc, image, ans, delRow, delCol, color, iniColor);
        return ans;
    }

    void dfs(int sr, int sc, int[][] image, int[][] ans, int[] delRow, int[] delCol, int color, int iniColor) {
        ans[sr][sc] = color;

        int n = ans.length;
        int m = ans[0].length;

        for (int i = 0; i < 4; i++) {
            int nrow = sr + delRow[i];
            int ncol = sc + delCol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor && ans[nrow][ncol] != color) {
                dfs(nrow, ncol, image, ans, delRow, delCol, color, iniColor);
            }
        }
    }
}
