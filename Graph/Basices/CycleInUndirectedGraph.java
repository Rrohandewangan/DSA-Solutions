public class CycleInUndirectedGraph {

     // Using DFS ->
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


    // Using BFS -> 
    // TC -> O(N + 2E)
    // SC -> O(N)
class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public boolean bfs(int src, int V, boolean[] vis, List<Integer>[] adj) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while(!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for(int it : adj[node]) {
                if(vis[it] == false) {
                    vis[it] = true;
                    q.add(new Pair(it, node));
                }
                else if(parent != it)  return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, List<Integer>[] adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis, false);
        for(int i=0; i<V; i++) {
            if(vis[i] == false) {
                if(bfs(i, V, vis, adj)) return true; 
            }
        }
        return false;
    }

    
    
    public static void main(String[] args) {
        
    }
}
