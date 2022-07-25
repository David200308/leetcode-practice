import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        
        int num1 = num / 1000;
        nums[0] = num1;
        int num2 = (num - num1 * 1000) / 100;
        nums[1] = num2;
        int num3 = (num - num1 * 1000 - num2 * 100) / 10;
        nums[2] = num3;
        int num4 = (num - num1 * 1000 - num2 * 100 - num3* 10);
        nums[3] = num4;
        
        
        Arrays.sort(nums);
        
        int answer = (nums[0] * 10 + nums[3]) + (nums[1] * 10 + nums[2]);
        return answer;
    }
}