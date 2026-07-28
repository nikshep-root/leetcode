class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}