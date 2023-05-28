class Solution {
    public int findLucky(int[] arr) {
        int answer = -1;
        HashMap<Integer, Integer> Sites = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (Sites.containsKey(arr[i])) {
                Sites.put(arr[i], Sites.get(arr[i]) + 1);
            } else {
                Sites.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (Sites.get(arr[i]) == arr[i]) {
                if (answer < arr[i]) {
                    answer = arr[i];
                }
            }
        }

        return answer;
    }
}