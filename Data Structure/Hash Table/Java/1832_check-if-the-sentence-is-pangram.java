class Solution {
    char[] letter = new char[26];
    public boolean checkIfPangram(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            letter[hash(current)] = current;
        }

        return check();
    }

    private int hash(char key) {
        int res = (int)key - 97;
        return res;
    }

    private boolean check() {
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] != (char)(i + 97)) {
                return false;
            }
        }
        return true;
    }
}