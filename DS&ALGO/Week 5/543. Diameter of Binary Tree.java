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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) { 
      height(root);
        return res;
    }
    public int height(TreeNode N){
        if(N==null){
            return 0;
        }
        
        int left_Depth = height(N.left); 
        int right_Depth = height(N.right);
        res = Math.max(res, left_Depth+right_Depth);
        return 1+ Math.max(left_Depth, right_Depth);
    }
}
