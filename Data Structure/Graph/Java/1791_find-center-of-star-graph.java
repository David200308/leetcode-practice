class Solution {
    public int findCenter(int[][] edges) {
        int first = edges[0][0];
        int second = edges[0][1];
        
        if (edges[1][0] == first || edges[1][1] == first) {
            return first;
        } else {
            return second;
        }
    }
}