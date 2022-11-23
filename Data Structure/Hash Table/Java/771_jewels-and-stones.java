class Solution {
    int[] letterCount = new int[58];
    public int numJewelsInStones(String jewels, String stones) {
        for (int i = 0; i < stones.length(); i++) {
            letterCount[hash((int)stones.charAt(i))]++;
            
        }
        
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            count += letterCount[hash((int)jewels.charAt(i))];
        }

        return count;
    }

    private int hash(int key) {
        return key - 65;
    }
}