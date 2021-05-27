class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root !=null) queue.add(root);
        while (!queue.isEmpty()) {
            
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i >= 1; i--) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null) queue.add(treeNode.left);
                if (treeNode.right != null) queue.add(treeNode.right);
            }
            
            res.add(list);
        }      
        return res;
    }
}
