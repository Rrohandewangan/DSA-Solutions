public class TopologicalSort {

    // Using DFS -> 
    // TC -> O(V + E)
    // SC -> O(V)
    public static void dfs(int node, int[] vis, Stack<Integer> s, List<List<Integer>> adj) {
        vis[node] = 1;
        for(int it : adj.get(node)) {
            if(vis[it] == 0) {
                dfs(it, vis, s, adj);
            }
        }
        s.push(node);
    }
    public int[] topoSort(int V, List<List<Integer>> adj) {
       int[] vis = new int[V];
       Stack<Integer> s = new Stack<>();
       for(int i=0; i<V; i++) {
         if(vis[i] == 0) {
            dfs(i, vis, s, adj);
         } 
       }
       int[] ans = new int[V];
       int i=0;
       while(!s.isEmpty()) {
        ans[i++] = s.peek();
        s.pop();
       }

       return ans;
    }
    

    // TOPO SORT USING BFS -> 
    // TC -> O(V + E)
    // SC -> O(V)
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int[] indegree = new int[V];
        for(int i=0; i<V; i++) {
            for(int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] topoSort = new int[V];
        int i = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            topoSort[i++] = node;

            for(int it : adj.get(node)) {
                indegree[it]--;
                if(indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return topoSort;   
    }
    public static void main(String[] args) {
        
    }
}
