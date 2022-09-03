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
    List<TreeNode> list = new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return buildBST(0, list.size());
    }
    
    public TreeNode buildBST(int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return null;
        }
        int midIndex = (startIndex + endIndex) / 2;
        TreeNode tree = new TreeNode(list.get(midIndex).val);
        
        tree.left = buildBST(startIndex, midIndex);
        tree.right = buildBST(midIndex + 1, endIndex);
        
        return tree;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}