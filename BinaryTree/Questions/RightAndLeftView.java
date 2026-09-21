public class RightAndLeftView {

    // Right View
    // TC -> O(N)
    // SC -> O(H)
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root, ans, 0);
        return ans;
    }
    public void rightView(TreeNode root, List<Integer> ans, int level) {
        if(root == null) {
            return;
        }

        if(level == ans.size()) {
            ans.add(root.val);
        }

        rightView(root.right, ans, level+1);
        rightView(root.left, ans, level+1);
    }
    // Left View
    // TC -> O(N)
    // SC -> O(H)
    public List<Integer> leftSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        leftView(root, ans, 0);
        return ans;
        
    public void leftView(TreeNode root, List<Integer> ans, int level) {
        if(root == null) {
            return;
        }

        if(level == ans.size()) {
            ans.add(root.val);
        }

        rightView(root.left, ans, level+1);
        rightView(root.right, ans, level+1);
    }



    public static void main(String[] args) {
        
    }
}
