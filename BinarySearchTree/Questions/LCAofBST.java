public class LCAofBST {
    
    // TC -> O(h)
    // SC -> O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        int curr = root.val;
        if(curr < p.val && curr < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if(curr > p.val && curr > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
    
    public static void main(String[] args) {
        
    }
}
