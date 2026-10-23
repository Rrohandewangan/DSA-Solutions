public class CycleInUndirectedGraph {

    // TC -> O(N + 2E) + O(N)
    // SC -> O(N)
    private boolean dfs(int node, int parent, int[] vis,  List<Integer>[] adj) {
        vis[node] = 1;
        for(int adjcentNode : adj[node]) {
            if(vis[adjcentNode] == 0) {
                if(dfs(adjcentNode, node, vis, adj) == true) return true;
            }
            else if(adjcentNode != parent) return true;
        }
        return false;
    }
    public boolean isCycle(int V, List<Integer>[] adj) {
        int[] vis = new int[V];
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                if(dfs(i, -1, vis, adj) == true) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
    }
}
