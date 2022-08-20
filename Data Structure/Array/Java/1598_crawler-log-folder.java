class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        String str = "";
        for (String log : logs) {
            String[] log_split = log.split("");
            
            if (log_split[0].equals(".") && log_split[1].equals(".")) {
                count--;
            } else if (log_split[0].equals(".")) {
                count = count;
            } else {
                count++;
            }
            
            if (count < 0) {
                count = 0;
            }
        }
        if (count < 0) {
            return 0;
        }
        return count;
    }
}