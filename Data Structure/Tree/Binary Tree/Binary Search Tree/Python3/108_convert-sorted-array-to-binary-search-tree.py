# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        return self.tree_helper(nums, 0, len(nums) - 1)
        
        
    def tree_helper(self, nums, leftIndex, rightIndex) -> Optional[TreeNode]:
        if leftIndex > rightIndex:
            return None
        
        if leftIndex == rightIndex:
            return TreeNode(nums[leftIndex])
        
        position = leftIndex + (rightIndex - leftIndex) // 2
        root = TreeNode(nums[position])
        left = self.tree_helper(nums, leftIndex, position - 1)
        right = self.tree_helper(nums, position + 1, rightIndex)
        
        root.left = left
        root.right = right
        
        return root