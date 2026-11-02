public class ShortestPath {
    
     // TC -> O(N * logM)
    // SC -> O(N)
    public List<Integer> shortestPath(int n, int m, int[][] edges) {
       List<List<int[]>> adj = new ArrayList<>();
       for(int i=0; i<=n; i++) {
         adj.add(new ArrayList<>());
       }

       for(int i=0; i<m; i++) {
          adj.get(edges[i][0]).add(new int[]{edges[i][1], edges[i][2]});
          adj.get(edges[i][1]).add(new int[]{edges[i][0], edges[i][2]});
       }

       PriorityQueue<int[]> pq = new PriorityQueue<>(
           (a, b) -> Integer.compare(a[0], b[0])
       );

       int[] dist = new int[n+1];
       int[] parent = new int[n+1];

       Arrays.fill(dist, (int) 1e9);

       for(int i=1; i<=n; i++) parent[i] = i;
          
       dist[1] = 0;
       pq.offer(new int[]{0, 1});

       while(!pq.isEmpty()) {
         int[] curr = pq.poll();

         int d = curr[0];
         int node = curr[1];

         if(d > dist[node]) continue;

         for(int[] it : adj.get(node)) {
            int adjNode = it[0];
            int wt = it[1];

            if(d + wt < dist[adjNode]) {
                dist[adjNode] = d + wt ;
                parent[adjNode] = node;

                pq.offer(new int[]{dist[adjNode], adjNode});
            }
         }
       }

       if(dist[n] == (int) 1e9) return Arrays.asList(-1);

       List<Integer> path = new ArrayList<>();

       int node = n;
       while(parent[node] != node) {
         path.add(node);
         node = parent[node];
       }
       path.add(1);
       Collections.reverse(path);
       path.add(0, dist[n]);

       return path;
    }


    public static void main(String[] args) {
        
    }
}
