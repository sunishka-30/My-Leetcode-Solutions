class Pair{
    int first;
    int second;
    public Pair(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        int m=roads.length;
        for(int i=0;i<m;i++)
        {
            adj.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
            
        }
    
        int[]dist = new int[n];
        int[]ways = new int[n];
        for(int i=0;i<n;i++)
        {  dist[i]=(int)1e18;
          ways[i]=0;
        }
        dist[0]=0;
        ways[0]=1;
        int mod  = (int)(1e9+7);
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.first-y.first);
        pq.add(new Pair(0,0));
        while(!pq.isEmpty())
        {
            int dis = pq.peek().first;
            int node = pq.peek().second;
            pq.remove();
            
            for(Pair it:adj.get(node))
            {
                int adjNode = it.first;
                int edgeN = it.second;
                if(dis+edgeN < dist[adjNode])
                {
                    dist[adjNode]=dis+edgeN;
                    pq.add(new Pair(dis+edgeN, adjNode));
                    ways[adjNode]=ways[node];
                }
                else if(dist[adjNode]==dis+edgeN)
                    ways[adjNode] = (ways[adjNode]+ways[node])%mod;
            }
        }
    return ways[n-1]%mod;
    }
}