public class AlienDictionary {

    // TC -> O(N * L + K + E)
    // SC -> O(K + E)
    private List<Integer> topoSort(int K, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[K];

        for(int i=0; i<K; i++) {
            for(int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<K; i++) {
            if(indegree[i] == 0) q.offer(i);
        }

        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            for(int it : adj.get(node)) {
                indegree[it]--;
                if(indegree[it] == 0) q.add(it);
            }
        }

        return topo;
    }
    public String findOrder(String [] dict, int N, int K) {
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

       for(int i=0; i<K; i++) {
        adj.add(new ArrayList<>());
       }

       for(int i=0; i < N - 1; i++) {
          String s1 = dict[i];
          String s2 = dict[i+1];
          int len = Math.min(s1.length(), s2.length());

          for(int ptr = 0; ptr < len; ptr++) {
            if(s1.charAt(ptr) != s2.charAt(ptr)) {
                adj.get(s1.charAt(ptr) - 'a')
                   .add(s2.charAt(ptr) - 'a');
                   break;
            }
          }
       }

       List<Integer> topo  = topoSort(K, adj);
       String ans = "";

       for(int letter : topo) {
         ans += (char) (letter + 'a')
       }
     return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
