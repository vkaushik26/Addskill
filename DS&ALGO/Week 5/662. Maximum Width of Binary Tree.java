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
    public int widthOfBinaryTree(TreeNode root) {
       if (root == null) 
            return 0;
        int maxwidth = 0; 
        Queue<TreeNode> q = new LinkedList<>(); 
        q.add(root); 
        while (!q.isEmpty())  
        { 
            int count = q.size(); 
            maxwidth = Math.max(maxwidth, count); 
            while (count-- > 0) { 
                TreeNode temp = q.remove(); 
                if (temp.left != null) 
                { 
                    q.add(temp.left); 
                } 
                if (temp.right != null) 
                { 
                    q.add(temp.right); 
                }
            } 
        } 
        return maxwidth+1;  
