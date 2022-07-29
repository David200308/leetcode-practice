class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sentence = new String[words.length];

        for (String word : words) {
            int i = word.length() - 1;
            sentence[word.charAt(i) - '1'] = word.substring(0, i);
        }

        return String.join(" ", sentence);
    }
}