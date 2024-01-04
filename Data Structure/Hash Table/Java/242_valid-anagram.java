class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> smap = new HashMap<>();
        Map<String, Integer> tmap = new HashMap<>();
        
        String[] sSplit = s.split("");
        String[] tSplit = t.split("");

        for (String sLetter : sSplit) {
            if (smap.containsKey(sLetter)) {
                smap.put(sLetter, smap.get(sLetter) + 1);
                continue;
            }
            smap.put(sLetter, 1);
        }
        
        for (String tLetter : tSplit) {
            if (tmap.containsKey(tLetter)) {
                tmap.put(tLetter, tmap.get(tLetter) + 1);
                continue;
            }
            tmap.put(tLetter, 1);
        }

        if (smap.equals(tmap)) {
            return true;
        }

        return false;
    }
}