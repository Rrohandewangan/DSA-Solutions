public class BipartiteGraph {

    // TC -> O(n + 2e)
    // SC -> O(V)
    private boolean dfs(int node, int col, int[] color,
    List<List<Integer>> adj) {
        color[node] = col;

        for(int it : adj.get(node)) {
            if(color[it] == -1) {
                if(dfs(it, 1 - col, color, adj) == false) return false;
            }
            else if(color[it] == col) {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int V, List<List<Integer>> edges) {
      List<List<Integer>> adj = new ArrayList<>();
      for(int i=0; i<V; i++) {
        adj.add(new ArrayList<>());
      }

      for(List<Integer> edge : edges) {
        int u = edge.get(0);
        int v = edge.get(1);

        adj.get(u).add(v);
        adj.get(v).add(u);
      }

      int[] color = new int[V];
      Arrays.fill(color, -1);

      for(int i=0; i<V; i++) {
        if(color[i] == -1) {
            if(dfs(i, 0, color, adj) == false) return false;
        }
      }
      return true;
    }
    
    // Leetcode version -> 
    // TC -> O(V + E)
    // SC -> O(V)
    private boolean dfs(int node, int currCol, int[] color,
    int[][] graph) {
        color[node] = currCol;

        for(int it : graph[node]) {
            if(color[it] == -1) {
                if(dfs(it, 1 - currCol, color, graph) == false) return false;
            }
            else if(color[it] == currCol) {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i=0; i<n; i++) {
          if(color[i] == -1) {
            if(dfs(i, 0, color, graph) == false) return false;
           }
        }
      return true;
    }
    public static void main(String[] args) {
        
    }
}
