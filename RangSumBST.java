package Recursion;


public class RangSumBST {

    static Integer s1 = new Integer(0);
    static Integer s2 = new Integer(0);

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, new TreeNode(5), new TreeNode(15));
        solution(root, 5, 15);
    }

    static public int solution(TreeNode root, int low, int high) {
        int ans = 0;
        if (root.val >= low && root.val <= high) ans += root.val;
        left(root.left, low, s1);
        right(root.right, high, s2);
        ans = s1 + s2 + ans;
        return ans;
    }



    static private void left(TreeNode root, int low, Integer s1) {
        if (root == null) return;
        if (root.val < low) return;
        s1 += root.val;
        left(root.left, low, s1);
        left(root.right, low, s1);
    }

    static private void right(TreeNode root, int high, Integer s2) {
        if (root == null) return;
        if (root.val > high) return;
        s2 += root.val;
        right(root.left, high, s2);
        right(root.right, high, s2);
    }

}
