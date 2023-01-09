class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], false);
            } else if (map.containsKey(nums[i])) {
                map.put(nums[i], true);
            }
        }
        if (map.containsValue(true)) {
            return true;
        }
        return false;
    }
}