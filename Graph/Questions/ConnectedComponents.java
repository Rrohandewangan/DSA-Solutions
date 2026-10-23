public class ConnectedComponents {
    
     // TC -> O(V + E)
     // SC -> O(V + E)
    private void dfs(int node, boolean[] vis, List<List<Integer>> adj) {

        vis[node] = true;
        
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(neighbor, vis, adj);
            }
        }
    }
    public int findNumberOfComponent(int V, List<List<Integer>> edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);

            adj.get(u).add(v);
            adj.get(v).add(u); // For an undirected graph
        }

        boolean[] vis = new boolean[V];
        int cnt = 0;

        for(i=0; i<V; i++) {
            if(!vis[i]) {
                cnt++;
                dfs(i, vis, adj);
            }
        }
    return cnt;
    }
    public static void main(String[] args) {
        
    }
}
