class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (stack.size() > 0 && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder ans = new StringBuilder("");
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}