//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Topo Sort
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj){
        List<List<Integer>> adjRev = new ArrayList<>();
        for(int i=0;i<V;i++)
        adjRev.add(new ArrayList<>());
        
        int[]inDegree=new int[V];
        for(int i=0;i<V;i++)
        {
            for(Integer it: adj.get(i))
            {
                adjRev.get(it).add(i);
                inDegree[i]++;
            }
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
    

    //Cycle Detection Method
    
    // List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
    //     List<Integer> ans = new ArrayList<>();
    //     int[]vis = new int[V];
    //     int[]pathVis = new int[V];
    //     int[]safe = new int[V];
        
    //     for(int i=0;i<V;i++)
    //     {
    //         if(vis[i]==0)
    //         dfs(i,vis,pathVis,safe,adj);
    //     }
        
    //     for(int i=0;i<V;i++)
    //     {
    //         if(safe[i]==1)
    //         ans.add(i);
    //     }
        
    //     return ans;
    // }
    
    // boolean dfs(int node, int[]vis, int[]pathVis, int[]safe, List<List<Integer>> adj)
    // {
    //     vis[node]=1;
    //     pathVis[node]=1;
    //     safe[node]=0;
    //     for(Integer it:adj.get(node))
    //     {
    //         if(vis[it]==0)
    //         {
    //             if(dfs(it,vis,pathVis,safe,adj)==true)
    //             return true;
    //         }
    //         else if(pathVis[it]==1)
    //         return true;
    //     }
        
    //     safe[node]=1;
    //     pathVis[node]=0;
    //     return false;
    // }
}
