class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right) {

        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (nums[middle] == target) {
            return middle;
        }

        if (target < nums[middle]) {
            return search(nums, target, left, middle - 1);
        }

        return search(nums, target, middle + 1, right);
    }
}