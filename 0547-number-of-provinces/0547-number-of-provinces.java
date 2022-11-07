class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());
        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        int[]vis = new int[V];
        int cnt=0;
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                cnt++;
                dfs(i,adj,vis);
            }
        }
        
        return cnt;
    }
    
    static void dfs(int i, ArrayList<ArrayList<Integer>> adj, int[]vis)
    {
        vis[i]=1;
        for(Integer it: adj.get(i))
        {
            if(vis[it]==0)
            {
                dfs(it,adj,vis);
            }
        }
    }
    
    
}