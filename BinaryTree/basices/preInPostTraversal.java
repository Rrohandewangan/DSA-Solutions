// TC -> O(3N)
// SC -> O(4N)

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

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    void setValue(V value) {
        this.value = value;
    }
}


class Solution {

    public List<List<Integer>> AllInOne(Node root) {

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if(root == null) {
            return new ArrayList<>();
        }

        Stack<Pair<Node, Integer>> st = new Stack<>();

        st.push(new Pair<>(root, 1));

        while (!st.isEmpty()) {
            Pair<Node, Integer> p = st.pop();

            // PreOrder num == 1
            if(p.getValue() == 1) {
                pre.add(p.getKey().data);
                p.setValue(2);
                st.push(p);

                if(p.getKey().left != null) {
                    st.push(new Pair<>(p.getKey().left, 1));
                }
            } 
            else if(p.getValue() == 2) {
                in.add(p.getKey().data);
                p.setValue(3);
                st.push(p);

                if(p.getKey().right != null) {
                    st.push(new Pair<>(p.getKey().right, 1));
                }
            }
            else {
                post.add(p.getKey().data);
            }

        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        
        return result;

    }
     public void printList(List<Integer> list) {

        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

}


public class preInPostTraversal {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create object of Solution class
        Solution sol = new Solution();

        // Getting the pre-order, in-order,
        // and post-order traversals
        List<List<Integer>> traversals = sol.AllInOne(root);

        // Extracting the traversals
        List<Integer> pre = traversals.get(0);
        List<Integer> in = traversals.get(1);
        List<Integer> post = traversals.get(2);

        // Printing the traversals
        System.out.print("Preorder traversal: ");
        sol.printList(pre);

        System.out.print("Inorder traversal: ");
        sol.printList(in);

        System.out.print("Postorder traversal: ");
        sol.printList(post);
    }
}
