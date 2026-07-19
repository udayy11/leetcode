class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        boolean[] used = new boolean[26];

        
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (used[ch - 'a']) {
                continue;
            }
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last[stack.peek() - 'a'] > i) {
                char removed = stack.pop();
                used[removed - 'a'] = false;
            }
            stack.push(ch);
            used[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}