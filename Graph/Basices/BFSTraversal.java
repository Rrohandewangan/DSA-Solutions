public class BFSTraversal {


    // TC -> O(n) + O(2E) E == no. of edges
    // SC -> O(3N)
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        int v = adj.size();
        
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);
            
            //Get all adjacent vertices of the dequeued node 
            // if it is not visited mark it as visited and add in queue
            for(Integer it : adj.get(node)) {
                if( vis[it] == false ) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    
    public static void main(String[] args) {
        
    }
}
