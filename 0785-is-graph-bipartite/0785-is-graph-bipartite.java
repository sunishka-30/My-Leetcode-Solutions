class Solution {
    public boolean isBipartite(int[][] graph) {
        int[]color = new int[graph.length];
        for(int i=0;i<graph.length;i++)
            color[i]=-1;
        
        for(int i=0;i<graph.length;i++)
        {
             if(graph[i].length!=0 && color[i]==-1)
             {
                 if(check(i,graph,color)==false)
                     return false;
             }
            
        }
        return true;
       }
    
    boolean check(int start, int[][]graph, int[]color)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start]=0;
        while(!q.isEmpty())
        {
            int node = q.peek();
            q.remove();
            for(int it:graph[node])
            {
                if(color[it]==-1)
                {
                    color[it]=1-color[node];
                    q.add(it);
                }
                else if(color[it]==color[node])
                    return false;
            }
            
            
        }
        return true;
    }
}