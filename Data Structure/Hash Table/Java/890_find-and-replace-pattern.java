class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();

        char[] patternArray = pattern.toCharArray();
        int patternLen = patternArray.length;

        HashMap<Character, Character> mapPattern = new HashMap<>();
        char patternTempChar = 'a' - 1;
        String tempPatternStr = "";

        for (int i = 0; i < patternArray.length; i++) {
            if (mapPattern.containsKey(patternArray[i])) {
                tempPatternStr += mapPattern.get(patternArray[i]);
            } else {
                patternTempChar += 1;
                mapPattern.put(patternArray[i], patternTempChar);
                tempPatternStr += String.valueOf(patternTempChar);
            }
        }
        System.out.println(tempPatternStr);
        

        for (int i = 0; i < words.length; i++) {
            char[] wordArray = words[i].toCharArray();

            HashMap<Character, Character> map = new HashMap<>();
            char temp = 'a' - 1;
            String tempPattern = "";

            if (patternLen == wordArray.length) {
                for (int j = 0; j < wordArray.length; j++) {
                    if (map.containsKey(wordArray[j])) {
                        tempPattern += map.get(wordArray[j]);
                    } else {
                        temp += 1;
                        map.put(wordArray[j], temp);
                        tempPattern += String.valueOf(temp);
                    }
                }
                if (tempPattern.equals(tempPatternStr)) {
                    list.add(words[i]);
                }
            }
        }
        return list;
    }
}