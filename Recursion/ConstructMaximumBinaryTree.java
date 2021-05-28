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
class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    public int currMax(int[] nums, int l, int r) {
        int max = -1;
        int index = -1;
        for (int i = l; i <= r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    public TreeNode buildTree(int[] nums, int l, int r) {
        if (l > r) return null;
        int index = currMax(nums, l, r);
        TreeNode root = new TreeNode(nums[index]);
        //删除数组中的节点
        nums[index] = -1;
        root.left = buildTree(nums, l, index - 1);
        root.right = buildTree(nums, index + 1, r);
        return root;
    }

}
