public class MaxDepthOfBT {

    // REcursive Approach ->
    // TC -> O(n)
    // SC -> O(n)
    public int maxDepth(TreeNode root) {
       if(root == null) return 0;

       int lh = maxDepth(root.left);
       int rh = maxDepth(root.right);

       return 1 + Math.max(lh, rh);

    }

    // level order traversal -> 
    // TC -> O(n)
    // SC -> O(n)
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode front = q.poll();

                if(front.left != null) {
                    q.add(front.left);
                }
                if(front.right != null) {
                    q.add(front.right);
                }
            }
            level++;
        }
        return level;
    }


    
    public static void main(String[] args) {
        
    }
}
