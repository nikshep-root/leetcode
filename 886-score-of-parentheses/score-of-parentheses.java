class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(char c: s.toCharArray()) {
            if(c == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int score = Math.max(2*v, 1);
                stack.push(stack.pop() +score);
            }
        }
        return stack.pop();
    }
}