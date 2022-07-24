class Solution {
    public int maximumWealth(int[][] accounts) {
        int size = accounts.length;
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            array[i] = temp;
        }
        
        int temp1 = 0;
        for (int z = 0; z < size; z++) {
            if (temp1 > array[z]) {
                temp1 = temp1;
            } else {
                temp1 = array[z];
            }
        }
        return temp1;
    }
}