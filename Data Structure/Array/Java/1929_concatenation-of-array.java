class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] array = new int[size * 2];
        
        for (int i = 0; i < size; i++) {
            array[i] = nums[i];
            array[size + i] = nums[i];
        }
        return array;
    }
}