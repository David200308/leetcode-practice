class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] hash = new int[101];

        for (int num : nums) {
            hash[num]++;
        }
        
        int result = 0;
        
        for (int i = 1; i < 101; i++) {
            if (hash[i] >= 2) {
                result += hash[i] * (hash[i] - 1) / 2;
            }
        }
        return result;
    }
}