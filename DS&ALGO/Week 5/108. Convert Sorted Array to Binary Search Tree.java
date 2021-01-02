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
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
 
        return bal_BST(num, 0, num.length - 1);
    }
 
    public TreeNode bal_BST(int[] num, int start, int end) {
        if (start > end)
            return null;
 
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = bal_BST(num, start, mid - 1);
        root.right = bal_BST(num, mid + 1, end);
 
        return root;
    }
}
