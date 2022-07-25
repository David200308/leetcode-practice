class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] newNums = new int[size];
        for (int i = 0; i < size; i++) {
            int a = nums[i];
            newNums[i] = nums[a];
        }
        return newNums;
    }
}