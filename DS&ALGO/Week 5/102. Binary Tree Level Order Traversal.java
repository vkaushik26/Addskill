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
     List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrdervalues( 0, root);
        return res;
    }
    
      public void levelOrdervalues(int level, TreeNode root) {
        if (root == null) {
            return;
        }
        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        levelOrdervalues(level + 1, root.left);
        levelOrdervalues(level + 1, root.right);
    }
}
