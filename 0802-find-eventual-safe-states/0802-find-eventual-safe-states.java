class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        List<List<Integer>> adjRev = new ArrayList<>();
         int[]inDegree=new int[V];
        for(int i=0;i<V;i++)
            adjRev.add(new ArrayList<Integer>());
        for(int i=0;i<V;i++)
            for(int j:graph[i])
            {
                
                    adjRev.get(j).add(i);
                     inDegree[i]++;
                
            }
        
        
       
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(inDegree[i]==0)
            q.add(i);
        }
        List<Integer> safe = new ArrayList<>();
        
        while(!q.isEmpty())
        {
            int node = q.peek();
            q.remove();
            safe.add(node);
            for(Integer it : adjRev.get(node))
            {
                inDegree[it]--;
                if(inDegree[it]==0)
                q.add(it);
            }
        }
        
        Collections.sort(safe);
        return safe;
    }
}