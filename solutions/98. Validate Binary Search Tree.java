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
    public boolean result(TreeNode node, Integer l, Integer u) {
    if (node == null) return true;
​
    int val = node.val;
    if (l != null && val <= l)
        return false;
    if (u != null && val >= u) 
        return false;
​
    if (! result(node.right, val, u)) 
        return false;
    if (! result(node.left, l, val)) 
        return false;
    return true;
  }
    public boolean isValidBST(TreeNode root) {
        return result(root, null, null);
    }
}
