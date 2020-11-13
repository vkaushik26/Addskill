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
class BSTIterator {
​
   ArrayList<Integer> nodes;
    int index;
    
    public BSTIterator(TreeNode root) {
         this.nodes = new ArrayList<Integer>();
        
        this.index = -1;
        
        this._inorder(root);
    }
    
    private void _inorder(TreeNode root) {
​
        if (root == null) {
            return;
        }
​
        this._inorder(root.left);
        this.nodes.add(root.val);
        this._inorder(root.right);
    }
    /** @return the next smallest number */
    public int next() {
        return this.nodes.get(++this.index);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return this.index + 1 < this.nodes.size();
    }
}
​
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
