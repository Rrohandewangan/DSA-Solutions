public class FindEventualSafeStates {
    

    // USING DFS AND FIND CYCLE IN DIRECTED GRAPH
    // TC -> O(V + E)
    // SC -> O(V)
    private boolean dfsCheck(int node, int[] check, int[] vis, int[] pathVis, int[][] graph) {
        vis[node] = 1;
        pathVis[node] = 1;
        check[node] = 0;

        for(int it : graph[node]) {
            if(vis[it] == 0) {
                if(dfsCheck(it, check, vis, pathVis, graph) == true) return true;
            }
            //if the node has been previously visited
            // but it has to be visited on the same path
            else if(pathVis[it] == 1) {
                return true;
            }
        }
        check[node] = 1;
        pathVis[node] = 0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        int[] vis = new int[V];
        int[] pathVis = new int[V];
        int[] check = new int[V];
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                dfsCheck(i, check, vis, pathVis, graph);
            }
        }
        List<Integer> safeNodes = new ArrayList<>();
        for(int i=0; i<V; i++) {
            if(check[i] == 1) safeNodes.add(i);
        }
        return safeNodes;
    }


    
    // USING TOPO SORT ->
    // TC -> O(V + E)
    // SC -> O(V)
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        List<List<Integer>> revGraph = new ArrayList<>();
        for(int i=0; i<V; i++) {
            revGraph.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for(int i=0; i<V; i++) {
           // i -> it
           // it -> i
            for(int it : graph[i]) {
                revGraph.get(it).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> safeNodes = new ArrayList<>();
        for(int i=0; i<V; i++) {
            if(indegree[i] == 0) q.offer(i);
        }

        while(!q.isEmpty()) {
            int node = q.poll();
            safeNodes.add(node);
            for(int it : revGraph.get(node)) {
                indegree[it]--;
                if(indegree[it] == 0) q.offer(it);
            }
        }
        Collections.sort(safeNodes);
        return safeNodes;
    }

    public static void main(String[] args) {
        
    }
}
