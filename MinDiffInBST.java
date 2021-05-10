class Solution {

    int ans = Integer.MAX_VALUE;
    int curr = 100001;

    public int minDiffInBST(TreeNode root) {
        preOrder(root);
        return ans;
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        preOrder(root.left);
        if (ans > Math.abs(root.val - curr)) ans = Math.abs(root.val - curr);
        curr = root.val;
        preOrder(root.right);
    }

}
