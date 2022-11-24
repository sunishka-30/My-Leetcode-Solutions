class Solution {
    public boolean exist(char[][] mat, String target) {
        boolean []ans=new boolean[1];
        ans[0]=false;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
               dfs(mat,i,j,0,target,ans);
            }
        }
        
        return ans[0];
    }
    static void dfs(char [][]mat, int i, int j, int ind, String target, boolean[] ans)
    {
        if(i<0 || j<0 || i==mat.length || j==mat[0].length || ind>=target.length() || target.charAt(ind)!=mat[i][j])
        return ;
        
        if(ind==target.length()-1)
        {
            ans[0]=true;   
            return ;
        }
        
        char ch = mat[i][j];
        mat[i][j]='0'; //to prevent from reusing the character
        
        dfs(mat,i+1,j,ind+1,target,ans);
        dfs(mat,i-1,j,ind+1,target,ans);
        dfs(mat,i,j+1,ind+1,target,ans);
        dfs(mat,i,j-1,ind+1,target,ans);
        
        mat[i][j]=ch; //to use it while backtracking
        
        
    }
}