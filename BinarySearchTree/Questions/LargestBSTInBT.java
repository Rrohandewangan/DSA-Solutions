class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

class NodeValue {
    public int maxNode, minNode, maxSize;

    NodeValue(int minNode, int maxNode, int maxSize) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
}
class Solution {
        private NodeValue largestBSTSubtree(TreeNode root) {
            // an empty tree is a BST of size 0.
            if(root == null) {
                return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
            }

            // get values from left and right subtree of current tree.
            NodeValue left = largestBSTSubtree(root.left);
            NodeValue right = largestBSTSubtree(root.right);

            // current node is greater then max in left and smaller then min in right, it is a BST
            if(left.maxNode < root.data && root.data < right.minNode) {
                // it is BST
                return new NodeValue(Math.min(root.data, left.minNode), Math.max(root.data, right.maxNode), left.maxSize + right.maxSize + 1);
            }

            // otherwise return [-int, int] so that parent can't be valid BST
            return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
        }

        public int largestBST(TreeNode root) {
            return largestBSTSubtree(root).maxSize;
        }
    }
public class LargestBSTInBT {
    
    public static void main(String[] args) {
         TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(20);

        Solution obj = new Solution();

        int answer = obj.largestBST(root);

        System.out.println("Largest BST size: " + answer);
    }
}

