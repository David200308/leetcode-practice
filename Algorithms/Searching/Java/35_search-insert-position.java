package Java;

class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    private int searchInsert(int[] nums, int target, int left, int right) {

        if (right < left) {
            return right + 1;
        }

        int middle = (left + right) / 2;

        if (nums[middle] == target) {
            return middle;
        }

        if (target < nums[middle]) {
            return searchInsert(nums, target, left, middle - 1);
        }

        return searchInsert(nums, target, middle + 1, right);
    }
}