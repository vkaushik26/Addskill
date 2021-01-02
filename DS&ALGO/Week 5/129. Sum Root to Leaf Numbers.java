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
    public int sumNumbers(TreeNode root) {
    if(root == null) 
        return 0;
    return dfs(root, 0, 0);
}
public int dfs(TreeNode node, int num, int sum){
    if(node == null) return sum;
    num = num*10 + node.val;
    if(node.left == null && node.right == null) {
        sum += num;
        return sum;
    }
    sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
    return sum;
  }
}
