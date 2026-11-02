public class DijkstraAlgo {

    // Using Priority Queue ->
    // TC -> O((V + E) log V)    
    // SC -> O(V + E)
    public  int[] dijkstra(int V, ArrayList<ArrayList<Integer>> edges, int S)
    {
       ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

       for(int i=0; i<V; i++) {
           adj.add(new ArrayList<>());
       }

       for(ArrayList<Integer> edge : edges) {
          int u = edge.get(0);
          int v = edge.get(1);
          int wt = edge.get(2);

          adj.get(u).add(new int[]{v, wt});
          adj.get(v).add(new int[]{u, wt});
       }

       PriorityQueue<int[]> pq = new PriorityQueue<>(
        (x, y) -> Integer.compare(x[0], y[0])
       );

       int[] dist = new int[V];
       Arrays.fill(dist, (int) 1e9);

       dist[S] = 0;
       pq.offer(new int[]{0, S});

       while(!pq.isEmpty()) {
          int[] curr = pq.poll();

          int dis = curr[0];
          int node = curr[1];

          if(dis > dist[node]) continue;

          for(int[] it : adj.get(node)) {
            int adjNode = it[0];
            int edgeWeight = it[1];

            if(dis + edgeWeight < dist[adjNode]) {
                dist[adjNode] = dis + edgeWeight;
                pq.offer(new int[]{dist[adjNode], adjNode});
            }
          }
       }
       return dist;
    }


    // Using Set -> 
     // TC -> O((v + E) * logV)
     // SC -> O(V)
    public ArrayList<Integer> dijkstra(ArrayList<ArrayList<ArrayList<Integer>>> adj,
                                       int src) {
        int V = adj.size();

                TreeSet<int[]> set = new TreeSet<>(
                    (a, b) -> {
                        if (a[0] != b[0]) {
                            return Integer.compare(a[0], b[0]);
                        }
                        return Integer.compare(a[1], b[1]);
                    }
                );

                int[] dist = new int[V];
                Arrays.fill(dist, (int) 1e9);

                dist[src] = 0;
                set.add(new int[]{0, src});

                while (!set.isEmpty()) {

                    int[] curr = set.pollFirst();
                    int dis = curr[0];
                    int node = curr[1];

                    for (ArrayList<Integer> it : adj.get(node)) {

                        int adjNode = it.get(0);
                        int wt = it.get(1);

                        if (dis + wt < dist[adjNode]) {

                            if (dist[adjNode] != (int) 1e9) {
                                set.remove(new int[]{dist[adjNode], adjNode});
                            }

                            dist[adjNode] = dis + wt;

                            set.add(new int[]{dist[adjNode], adjNode});
                        }
                    }
                }

                ArrayList<Integer> ans = new ArrayList<>();

                for (int d : dist) {
                    ans.add(d);
                }

                return ans;
        
    }
    
    public static void main(String[] args) {
        
    }

}
