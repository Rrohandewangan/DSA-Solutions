public class ShortestPathInUndirectedGraph {

    // TC -> O(V + E)
    // SC -> O(V + E)
    public int[] shortestPath(int[][] edges, int N, int M) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<N; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int[] dist = new int[N];
        Arrays.fill(dist, (int)1e9);
        dist[0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int it : adj.get(node)) {
                if(dist[node] + 1 < dist[it]) {
                    dist[it] = dist[node] + 1;
                    q.add(it);
                }
            }
        }
        for(int i=0; i<N; i++) {
            if(dist[i] == (int)1e9) dist[i] = -1;
        }

        return dist;
    }
}
    
    public static void main(String[] args) {
        
    }
}
