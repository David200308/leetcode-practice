class Solution {
    public int mostWordsFound(String[] sentences) {
        int size = sentences.length;
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            String[] str = sentences[i].split(" ");
            array[i] = str.length;
        }
        
        int max = 0;
        
        for (int z = 0; z < size; z++) {
            if (max > array[z]) {
                max = max;
            } else {
                max = array[z];
            }
        }
        return max;
    }
}