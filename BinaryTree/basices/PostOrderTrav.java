// TC -> O(n)
// SC -> O(n)

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// Recursive Approach ->
// class Solution {
        
//     public static void postorder(Node root, List<Integer> arr) {
//         if(root == null) {
//             return;
//         }

//         postorder(root.left, arr);
//         postorder(root.right, arr);
//         arr.add(root.data);
        
//     }

// iterative Approach -> 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(root == null) return list;

        s1.push(root);
        while(!s1.isEmpty()) {
            root = s1.pop();
            s2.push(root);
            if(root.left != null) s1.push(root.left);
            if(root.right != null) s1.push(root.right);
        }
        while(!s2.isEmpty()) {
            list.add(s2.pop().val);
        }
        return list;
    }

    // 1 - stack approach -> 
    class Solution {
    // TC -> O(2n)
    // SC -> O(n)
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        TreeNode curr = root;
        TreeNode temp;

        while(curr != null || !s.isEmpty()) {

            if(curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                temp = s.peek().right;
                if(temp == null) {
                    temp = s.peek();
                    s.pop();
                    postOrder.add(temp.val);
                    while(!s.isEmpty() && temp == s.peek().right) {
                        temp = s.peek();
                        s.pop();
                        postOrder.add(temp.val);
                    }
                } else {
                    curr = temp;
                }
            }
        } 
        return postOrder;
    }
}

    public List<Integer> postOrder(Node root) {
            
        List<Integer> arr = new ArrayList<>();

        postorder(root, arr);

        return arr;
    }
}

public class PostOrderTrav {
        public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();
        List<Integer> result = sol.postOrder(root);

        System.out.println("postorder Traversal :");

        for(int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
