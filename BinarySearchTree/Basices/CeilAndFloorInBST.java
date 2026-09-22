public class CeilAndFloorInBST {

    static class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

    
    // TC -> O(logn)
    public static int findCeil(TreeNode root, int key) {
        int ceil = -1;
        while(root != null) {
            if(root.data == key) {
                ceil = root.data;
                return ceil;
            }
        if(key > root.data) {
            root = root.right;
        } else {
            ceil = root.data;
            root = root.left;
        }
    }
        return ceil;
    }
    // TC -> O(logn)
    public static int findFloor(TreeNode root, int key) {
        int floor = -1;
        while(root != null) {
            if(root.data == key) {
                floor = root.data;
                return floor;
            }
        if(key > root.data) {
            floor = root.data;
            root = root.right;
        } else {
            root = root.left;
        }
    }
        return floor;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(4);
        root.right = new TreeNode(12);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        int key = 5;

        int result = findFloor(root, key);

        System.out.println("floor of " + key + " = " + result);
    }
}
