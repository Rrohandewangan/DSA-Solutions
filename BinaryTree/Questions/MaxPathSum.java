public class MaxPathSum {

    // TC _> O(n)
    // SC -> O(h)
    public int maxSum = Integer.MIN_VALUE;

    private int maxPathDown(TreeNode root) {
        if(root == null) return 0;

        int left = Math.max(0, maxPathDown(root.left));
        int right = Math.max(0, maxPathDown(root.right));

        maxSum = Math.max(maxSum, left + right + root.val);
        
        return root.val + (Math.max(left, right));
    }
    public int maxPathSum(TreeNode root) {
       maxPathDown(root);
       return maxSum;
    }
    
    public static void main(String[] args) {
        
    }
}
