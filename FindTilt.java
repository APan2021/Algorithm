class FindTilt {
    
    int tilt = 0;
    public int findTilt(TreeNode root) {
        find(root);
        return tilt;
    }

    public int find(TreeNode root) {
        if (root == null) return 0;
        int left = find(root.left);
        int right = find(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }

}
