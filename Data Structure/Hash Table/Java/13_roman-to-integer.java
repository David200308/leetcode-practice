class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char[] str = s.toCharArray();
        
        int prev = 0;
        int decimal = 0;
        
        for (int i = str.length - 1; i >= 0; i--) {
            if (map.get(str[i]) < prev) {
                decimal -= map.get(str[i]);
            } else if (map.get(str[i]) >= prev) {
                decimal += map.get(str[i]);
            }
            prev = map.get(str[i]);
        }
        return decimal;
    }
}