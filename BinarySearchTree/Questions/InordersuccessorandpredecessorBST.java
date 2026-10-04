public class InordersuccessorandpredecessorBST {

    public int findSuccessor(TreeNode root, int key) {
        int successor = -1;

        while(root != null) {

            if(key >= root.val) {
                root = root.right;
            }
            else {
                successor = root.val;
                root = root.left;
            }
        }
        return successor;
    }

    public int findPredecessor(TreeNode root, int key) {
        int predecessor = -1;

        while(root != null) {

            if(key > root.val) {
                predecessor = root.val;
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
        return predecessor;
    }

    List<Integer> succPredBST(TreeNode root, int key) {
        List<Integer> ans = new ArrayList<>();

        ans.add(findPredecessor(root, key));
        ans.add(findSuccessor(root, key));
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
