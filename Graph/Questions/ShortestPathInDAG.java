public class ShortestPathInDAG {

    // TC -> O(N + E)
    // SC -> O(N + E)
class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    private void topoSort(int node, ArrayList<ArrayList<Pair>> adj,
                          int[] vis, Stack<Integer> st) {
        vis[node] = 1;

        for (Pair it : adj.get(node)) {
            int v = it.first;

            if (vis[v] == 0) {
                topoSort(v, adj, vis, st);
            }
        }

        st.push(node);
    }

    public int[] shortestPath(int N, int M, int[][] edges) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ArrayList<Pair> temp = new ArrayList<>();
            adj.add(temp);
        }

        // Step 2: Add weighted directed edges
        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];

            adj.get(u).add(new Pair(v, wt));
        }

        // Step 3: Topological sort using DFS
        int[] vis = new int[N];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                topoSort(i, adj, vis, st);
            }
        }

        // Step 4: Initialize distances
        int[] dist = new int[N];
        Arrays.fill(dist, (int) 1e9);

        dist[0] = 0;

        // Step 5: Relax edges in topological order
        while (!st.isEmpty()) {
            int node = st.pop();

            if (dist[node] == (int) 1e9) {
                continue;
            }

            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;

                if (dist[node] + wt < dist[v]) {
                    dist[v] = wt + dist[node];
                }
            }
        }

        // Step 6: Mark unreachable nodes
        for (int i = 0; i < N; i++) {
            if (dist[i] == (int) 1e9) {
                dist[i] = -1;
            }
        }

        return dist;
    }
}

}