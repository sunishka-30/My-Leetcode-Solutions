class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++)
            adjList.add(new ArrayList<>());
        
        for(int[]e:edges)
        {
            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);
        }
        
        Set<Integer> vis = new HashSet<>();
        int[]ans=new int[n];
        dfs(0,adjList,labels,vis,ans);
        
        return ans;
    }
    
    int[] dfs(int node, List<List<Integer>> adjList, String labels, Set<Integer>vis, int[]ans)
    {
        vis.add(node);
        int[]count = new int[26];
        for(int adj:adjList.get(node))
        {
            if(!vis.contains(adj))
            {
                int[]temp = dfs(adj,adjList,labels,vis,ans);
                for(int i=0;i<26;i++)
                {
                    count[i]+=temp[i];
                }
            }
        }
        char ch = labels.charAt(node);
        count[ch-'a']++;
        ans[node] = count[ch-'a'];
        return count;
    }
}