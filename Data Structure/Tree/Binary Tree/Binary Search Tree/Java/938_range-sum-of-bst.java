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
    
    ArrayList<Integer> list = new ArrayList<>();
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        int num = 0;
        inorder(root);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > low && list.get(i) < high) {
                num += list.get(i);
            }
        }
        return num + low + high;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}