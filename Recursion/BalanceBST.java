/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BalanceBST {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        TreeNode ans = buildBcalanceBST(list, 0, list.size() - 1);
        return ans;
    }

    public TreeNode buildBcalanceBST(List list, int left, int right) {
        if (left == right) return new TreeNode((int) list.get(left));
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode((int) list.get(mid));
        node.left = buildBcalanceBST(list, left, mid - 1);
        node.right = buildBcalanceBST(list, mid + 1, right);
        return node;
    }

    public void inOrder(List list, TreeNode root) {
        if (root == null) return;
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }
}
