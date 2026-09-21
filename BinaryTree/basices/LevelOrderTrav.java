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

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<size; i++) {
                Node node = q.poll();
                level.add(node.data);

                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(level);           
        }

        return ans;

    }
  
}



public class LevelOrderTrav {
     public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrder(root);

        System.out.println("Level Traversal :");

       for(List<Integer> level : result) {
        System.out.println(level);
       }
    }
}
