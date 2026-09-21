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
        
//     public static void inorder(Node root, List<Integer> arr) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left, arr);
//         arr.add(root.data);
//         inorder(root.right, arr);

//     }

//     public List<Integer> inOrder(Node root) {
            
//         List<Integer> arr = new ArrayList<>();

//         inorder(root, arr);

//         return arr;
//     }
// }

// Iterative Approach ->
class Solution {
    public List<Integer> inOrder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
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
                    list.add(node.data);
                    node = node.right;
                }
            }
        }
        return list;

    }
}
public class InorderTrav {
    
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();
        List<Integer> result = sol.inOrder(root);

        System.out.println("inorder Traversal :");

        for(int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
