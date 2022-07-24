class Solution {
    public int[] runningSum(int[] nums) {
        int temp = 0;
        int size = nums.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            temp = nums[i] + temp;
            array[i] = temp;
        }
        return array;
    }
}