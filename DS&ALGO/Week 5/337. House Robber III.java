/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] kitna_loota(TreeNode node) {
        if (node == null) {
            return new int[] { 0, 0 };
        }
        int left[] = kitna_loota(node.left);
        int right[] = kitna_loota(node.right);
        int churale = node.val + left[1] + right[1];
        int nhi_churana = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[] { churale, nhi_churana };
    }
    public int rob(TreeNode root) {
        int[] answer = kitna_loota(root);
        return Math.max(answer[0], answer[1]);
    }
}
