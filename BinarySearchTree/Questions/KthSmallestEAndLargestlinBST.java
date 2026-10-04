public class KthSmallestEAndLargestlinBST {

    // TC -> O(n)
    // SC -> O(h)
    public int kthSmallest(TreeNode root, int k) {
         Stack<TreeNode> st = new Stack<>();
         TreeNode node = root;
         int cnt = 0;

         while(true) {
            if(node != null) {
                st.push(node);
                node = node.left;
            }
            else {
                if(st.isEmpty()) {
                    break;
                }
                else {
                    node = st.pop();
                    cnt++;
                    if(cnt == k) {
                        return node.data;
                    }
                    node = node.right;
                }
            }
         }
    return -1;
    }

    // TC -> O(n)
    // SC -> O(h)
    public int KthLargest(TreeNode root, int k) {
         Stack<TreeNode> st = new Stack<>();
         TreeNode node = root;
         int cnt = 0;

         while(true) {
            if(node != null) {
                st.push(node);
                node = node.right;
            }
            else {
                if(st.isEmpty()) {
                    break;
                }
                else {
                    node = st.pop();
                    cnt++;
                    if(cnt == k) {
                        return node.data;
                    }
                    node = node.left;
                }
            }
         }
    return -1;
    }

    public List<Integer> kLargesSmall(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        list.add(kthSmallest(root, k));
        list.add(KthLargest(root, k));
        return list;
    }
    
    public static void main(String[] args) {
        
    }
}
