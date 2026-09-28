class Solution {
    public int maxDepth(String s) {
        //f()
        int brac = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                brac++;
            }
            else if(ch == ')'){
                max = Math.max(max,brac);
                brac--;
            }
        }
        return max == Integer.MIN_VALUE? 0 : max;
    }
}