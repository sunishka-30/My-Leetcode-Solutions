class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
        for(int i=0;i<V;i++)
        adj.add(new ArrayList<>());
         
        for (int[] edge : prerequisites) 
        adj.get(edge[1]).add(edge[0]);
        
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
        
        int[]topoSort = new int[V];
        int i=0;
        while(!q.isEmpty())
        {
            int node = q.peek();
            q.remove();
            topoSort[i++]=node;
            for(Integer it: adj.get(node))
            {
                inDegree[it]--;
                if(inDegree[it]==0)
                {
                    q.add(it);
                }
            }
        }
        if(i==V)
        return topoSort;
        int[]ar={};
        return ar;
    }
}