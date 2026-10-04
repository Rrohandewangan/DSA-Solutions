public class BSTiterator {

    // TC -> O(1)
    // SC -> O(h)
    private Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    // return the next smallest number // 
    public int next() {
        TreeNode tempNode = st.pop();
        pushAll(tempNode.right);
        return tempNode.data;
    }
    
    // return whether we have a next smallest number //
    public boolean hasNext() {
        return !st.isEmpty();
    }

    private void pushAll(TreeNode node) {
        for(; node != null; st.push(node), node = node.left);
    }

    public static void main(String[] args) {
        
    }
}