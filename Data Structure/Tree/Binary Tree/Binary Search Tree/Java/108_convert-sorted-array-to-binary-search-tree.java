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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree_helper(nums, 0, nums.length - 1);   
    }
    
    public TreeNode tree_helper(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }
        
        if (leftIndex == rightIndex) {
            return new TreeNode(nums[leftIndex]);
        }
        
        int position = leftIndex + (rightIndex - leftIndex) / 2;
        
        TreeNode root = new TreeNode(nums[position]);
        TreeNode left = tree_helper(nums, leftIndex, position - 1);
        TreeNode right = tree_helper(nums, position + 1, rightIndex);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
}