public class CheckBalancedTree {

    // brute force ->
    // TC -> O(n2)
    // SC -> O(H)  h -> height of tree
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;                                       
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);

        if(Math.abs(rh - lh) > 1) return false;

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if(!left || !right) return false;
        return true;
    }
    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // optimal approach->
    // TC -> O(n)
    // SC -> O(H)
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        if(leftHeight == -1) return -1;
        int rightHeight = getHeight(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public static void main(String[] args) {
        
    }
}
