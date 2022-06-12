import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> a_list = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (target[count] != i) {
                a_list.add("Push");
                a_list.add("Pop");
            } else {
                a_list.add("Push");
                count++;
            }
            
            if (target.length == count) {
                break;
            }
        }
        return a_list;
    }
}

