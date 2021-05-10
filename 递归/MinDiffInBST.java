class MinDiffInBST {

    int ans = Integer.MAX_VALUE;
    int curr = 100001;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (ans > Math.abs(root.val - curr)) ans = Math.abs(root.val - curr);
        curr = root.val;
        inOrder(root.right);
    }

}
