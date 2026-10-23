public class DFSTraversal {
    
    // TC -> O(n + 2*e) // total degree of graph -> 2 * e
    // SC -> O(n)
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        
        vis[node] = true;
        ls.add(node);
        
        for(Integer it : adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
       
       int v = adj.size();
       
       boolean[] vis = new boolean[v + 1];
       vis[0] = true;
       ArrayList<Integer> ls = new ArrayList<>();
       dfs(0, vis, adj, ls);
       return ls;
        
    }

//     import java.util.*;

// class Solution {

//     private List<List<Integer>> buildAdj(
//             int V, List<List<Integer>> edges) {

//         List<List<Integer>> adj = new ArrayList<>();

//         for (int i = 0; i < V; i++) {
//             adj.add(new ArrayList<>());
//         }

//         for (List<Integer> edge : edges) {
//             int u = edge.get(0);
//             int v = edge.get(1);

//             adj.get(u).add(v);
//             adj.get(v).add(u); // For an undirected graph
//         }

//         return adj;
//     }

//     private void dfs(int node, boolean[] vis,
//                      List<List<Integer>> adj, List<Integer> result) {

//         vis[node] = true;
//         result.add(node);

//         for (int neighbor : adj.get(node)) {
//             if (!vis[neighbor]) {
//                 dfs(neighbor, vis, adj, result);
//             }
//         }
//     }

//     public List<Integer> dfsOfGraph(int V, List<List<Integer>> edges) {
//         List<Integer> result = new ArrayList<>();
//         if (V == 0) return result;

//         List<List<Integer>> adj = buildAdj(V, edges);
//         boolean[] vis = new boolean[V];

//         dfs(0, vis, adj, result);
//         return result;
//     }

//     public List<Integer> bfsOfGraph(int V, List<List<Integer>> edges) {
//         List<Integer> result = new ArrayList<>();
//         if (V == 0) return result;

//         List<List<Integer>> adj = buildAdj(V, edges);
//         boolean[] vis = new boolean[V];
//         Queue<Integer> q = new ArrayDeque<>();

//         q.offer(0);
//         vis[0] = true;

//         while (!q.isEmpty()) {
//             int node = q.poll();
//             result.add(node);

//             for (int neighbor : adj.get(node)) {
//                 if (!vis[neighbor]) {
//                     vis[neighbor] = true;
//                     q.offer(neighbor);
//                 }
//             }
//         }

//         return result;
//     }
// }
    public static void main(String[] args) {
        
    }
}
