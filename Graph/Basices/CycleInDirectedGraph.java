public class CycleInDirectedGraph {

    // Using DFS -> 
    // TC -> O(V + E)
    // SC -> O(V + E)
    private boolean dfs(int node, int[] vis, int[] pathVis, List<List<Integer>> adj) {
        vis[node] = 1;
        pathVis[node] = 1;

        for(int it : adj.get(node)) {
            if(vis[it] == 0) {
                if(dfs(it, vis, pathVis, adj) == true) return true;
            }
            else if(pathVis[it] == 1) {
                return true;
            }
        }

        pathVis[node] = 0;
        return false;
    }
    public boolean isCyclic(int V, List<List<Integer>> adj) {
      int[] vis = new int[V];
      int[] pathVis = new int[V];

      for(int i=0; i<V; i++) {
        if(vis[i] == 0) {
            if(dfs(i, vis, pathVis, adj) == true) return true;
        }
      }
      return false;
    }


    // Using BFS AND TOPO SORT -> 
    // TC -> O(V + E)
    // SC -> O(2N)
    public boolean isCyclic(int V, List<List<Integer>> adj) {
      int[] inDegree = new int[V];
      for(int i=0; i<V; i++) {
        for(int it : adj.get(i)) {
            inDegree[it]++;
        }
      }

      Queue<Integer> q = new LinkedList<>();
      for(int i=0; i<V; i++) {
        if(inDegree[i] == 0) {
            q.offer(i);
        }
      }

      int cnt = 0;
      while(!q.isEmpty()) {
        int node = q.poll();
        cnt++;

        //node is in your topo sort
        // so remove it from the inDegree

        for(int it : adj.get(node)) {
            inDegree[it]--;
            if(inDegree[it] == 0) q.add(it);
        }
      }

      if(cnt == V) return false;
      return true;
    }
    
    public static void main(String[] args) {
        
    }
}
