/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BstToGst {
    Deque<TreeNode> stack = new ArrayDeque<>();
    public TreeNode bstToGst(TreeNode root) {
        inOrder(root);
        int curr = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollFirst();
            node.val += curr;
            curr = node.val;
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        stack.addFirst(root);
        inOrder(root.right);
    }
}
