class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int updateCount = map.get(arr[i]) + 1;
                map.put(arr[i], updateCount);
                continue;
            }
            map.put(arr[i], 1);
        }

        int count = new HashSet<Integer>(map.values()).size();
        
        if (count == map.size()) {
            return true;
        }
        return false;
    }
}