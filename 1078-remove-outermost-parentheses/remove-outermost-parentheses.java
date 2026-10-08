class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(level>0) sb.append('(');
                level++;
            }
            if(ch==')'){
                level--;
                if(level>0) sb.append(')');
            }
        }
        return sb.toString();
    }
}