class Solution {
    public String restoreString(String s, int[] indices) {
        String[] letter = s.split("");
        String[] words = new String[letter.length];
        for (int i = 0; i < letter.length; i++) {
            int index = indices[i];
            words[index] = letter[i];
        }
        String result = "";
        for (String word : words) {
            result += word;
        }

        return result;
    }
}