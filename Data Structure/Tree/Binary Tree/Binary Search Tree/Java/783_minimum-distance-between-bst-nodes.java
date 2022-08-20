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
class Solution {
    TreeNode temp;
    int min = Integer.MAX_VALUE;
    
    public int minDiffInBST (TreeNode root) {
        inorder(root);
        return min;
    }
    
    public void inorder (TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        
        if (temp != null) {
            min = Math.min(min, root.val - temp.val);
        }
        
        temp = root;
        inorder(root.right);
    }
}