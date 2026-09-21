public class ZigZagTraversal {

    // TC -> O(n)
    // SC -> O(n)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Boolean leftToRight = true;
        while(!q.isEmpty()) {
            int size = q.size();
            Integer[] level = new Integer[size];
            
            for(int i=0; i<size; i++) {
               TreeNode node = q.poll();

               int index = leftToRight ? i : size - i - 1 ;
               level[index] = node.val;

               if(node.left != null) q.offer(node.left);
               if(node.right != null) q.offer(node.right);
            }
            leftToRight = !leftToRight;
            result.add(Arrays.asList(level));
        }
        return result;
    }
public static void main(String[] args) {
    
}
}
