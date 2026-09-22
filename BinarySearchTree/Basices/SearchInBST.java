public class SearchInBST {

    // TC -> O(logn)
    // SC -> O(1)

    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.data != val) {
            root = val < root.data ? root.left : root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
