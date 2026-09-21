import java.util.*;

// TC -> O(n)
// SC -> O(n)
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    public List<Integer> bottomView(Node root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        Map<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));


        while (!q.isEmpty()) {

            Pair p = q.poll();

            Node node = p.node;
            int line = p.line;

            map.put(line, node.data);

            if(node.left != null){
                q.add(new Pair(node.left, line - 1));
            }
            if(node.right != null){
                q.add(new Pair(node.right, line + 1));
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;

    }

    static class Pair {
        Node node;
        int line;

        public Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        } 
    }
}

public class BottomView {
    
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        Solution solution = new Solution();

        // Get the Bottom View traversal
        List<Integer> bottomView = solution.bottomView(root);

        // Print the result
        System.out.println("Bottom View Traversal: ");
        for(int node : bottomView) {
            System.out.print(node + " ");
        }
    }
}
