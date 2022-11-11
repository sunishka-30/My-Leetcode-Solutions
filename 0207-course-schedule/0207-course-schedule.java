class Solution {
    public boolean canFinish(int V, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
        for(int i=0;i<V;i++)
        adj.add(new ArrayList<>());
         int m = prerequisites.length;
        for (int i=0;i<m;i++) 
        adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        
        int[]inDegree = new int[V];
        for(int i=0;i<V;i++)
        {
            for(Integer it: adj.get(i))
            inDegree[it]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<V;i++)
        {
            if(inDegree[i]==0)
            q.add(i);
        }
        
        List<Integer> topoSort = new ArrayList<>();
        
        int i=0;
        while(!q.isEmpty())
        {
            int node = q.peek();
            q.remove();
            topoSort.add(node);
            for(Integer it: adj.get(node))
            {
                inDegree[it]--;
                if(inDegree[it]==0)
                {
                    q.add(it);
                }
            }
        }
        if(topoSort.size()==V)
        return true;
        return false;
    }
}