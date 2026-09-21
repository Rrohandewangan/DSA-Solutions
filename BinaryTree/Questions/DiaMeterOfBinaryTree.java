public class DiaMeterOfBinaryTree {

    // Brute Force ->
    // TC -> O(n2)
    // SC -> O(H)
    public int findHeight(TreeNode root) {
       if(root == null) return 0;

       int leftHeight = findHeight(root.left);
       int rightHeight = findHeight(root.right);

       return 1 + Math.max(leftHeight, rightHeight);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        int currDiameter = lh + rh;

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
    }

    // Optimal Approach ->
    // TC -> O(N)
    // SC ->O(H)
    public int diaMeter = 0;
    public int findDiameter(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lh = findDiameter(root.left);
        int rh = findDiameter(root.right);

        diaMeter = Math.max(diaMeter, lh + rh);

        return 1 + Math.max(lh, rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return diaMeter;
    }

    // Optimal Approach ->
    // TC -> O(N)
    // SC ->O(H)
    public int findDiameter(TreeNode root, int[] diaMeter) {
        if(root == null) {
            return 0;
        }
        int lh = findDiameter(root.left, diaMeter);
        int rh = findDiameter(root.right, diaMeter);

        diaMeter[0] = Math.max(diaMeter[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diaMeter = new int[1];
        findDiameter(root, diaMeter);
        return diaMeter[0];
    }
    
    public static void main(String[] args) {
        
    }
}
