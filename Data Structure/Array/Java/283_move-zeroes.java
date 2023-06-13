class Solution {
    public void moveZeroes(int[] nums) {
        int[] list = new int[nums.length];
        
        int index = 0;
        int zeroNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroNum++;
            } else {
                // System.out.println(nums[i]);
                list[index] = nums[i];
                // System.out.println(list[index]);
                index++;
            }
        }

        // System.out.println(zeroNum);

        for (int i = 0; i < zeroNum; i++) {
            list[index] = 0;
            index++;
        }

        for (int i = 0; i < list.length; i++) {
            nums[i] = list[i];
        }

    }
}