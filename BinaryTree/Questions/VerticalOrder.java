public class VerticalOrder {

    // TC -> O(n * logn * logn)
    // SC -> O(n + n/2)
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0, 0));

        while(!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode temp = p.node;
            int x = p.vertical;
            int y = p.level;

            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).offer(temp.val);

            if(temp.left != null) {
                q.offer(new Pair(temp.left, x - 1, y + 1));
            }
            if(temp.right != null) {
                q.offer(new Pair(temp.right, x + 1, y + 1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> col = new ArrayList<>();
            for(PriorityQueue<Integer> pq : ys.values()) {
                while(!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            ans.add(col);
        }
        return ans;
    }

    static class Pair {
        TreeNode node;
        int vertical;
        int level;

        Pair(TreeNode n, int v, int l) {
            node = n;
            vertical = v;
            level = l;
        }
    }

    public static void main(String[] args) {
        
    }
}