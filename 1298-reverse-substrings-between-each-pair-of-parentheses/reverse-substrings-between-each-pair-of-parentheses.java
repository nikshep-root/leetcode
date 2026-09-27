class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack =new Stack<>();
        for(char ch : s.toCharArray()){
            
            if(ch == ')'){
                StringBuilder sb= new StringBuilder();
                while(stack.peek() != '('){
                    sb.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
                for(int j = 0;j < sb.length();j++){
                    stack.push(sb.charAt(j));
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder res= new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}