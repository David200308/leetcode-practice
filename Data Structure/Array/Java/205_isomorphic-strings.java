class Solution {
    public boolean isIsomorphic(String s, String t) {
        String sPosition = "";
        String tPosition = "";

        String[] sSplitArray = s.split("");
        String[] tSplitArray = t.split("");

        ArrayList<String> sArray = new ArrayList<>();
        ArrayList<String> tArray = new ArrayList<>();

        for (int i = 0; i < sSplitArray.length; i++) {
            if (sArray.contains(sSplitArray[i])) {
                sPosition = sPosition + sArray.indexOf(sSplitArray[i]) + " ";
                continue;
            }
            sArray.add(sSplitArray[i]);
            sPosition = sPosition + sArray.indexOf(sSplitArray[i]) + " ";
        }

        for (int i = 0; i < tSplitArray.length; i++) {
            if (tArray.contains(tSplitArray[i])) {
                tPosition = tPosition + tArray.indexOf(tSplitArray[i]) + " ";
                continue;
            }
            tArray.add(tSplitArray[i]);
            tPosition = tPosition + tArray.indexOf(tSplitArray[i]) + " ";
        }

        if (sPosition.equals(tPosition)) {
            return true;
        }
        return false;
    }
}