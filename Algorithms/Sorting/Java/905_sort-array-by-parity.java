class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int count = 0;
        
        int[] output = new int[nums.length];
        
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                output[count] = nums[i];
                count++;
            }
        }
            
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                output[count] = nums[i];
                count++;
            }
        }
        
        return output;
    }
}