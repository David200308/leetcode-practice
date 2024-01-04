class Solution {
    public int arrangeCoins(int n) {
        int temp = 1;
        int a = 0;

        while(n >= 0) {
            n = n - temp;
            temp++;
            a++;
        }

        return a - 1;
    }
}