class Solution {
    public boolean checkString(String s) {
        boolean active = false;
        for(int i =0;i<s.length();i++){
            if(active && s.charAt(i) == 'a') return false;
            if(s.charAt(i) == 'b') active = true;
        }
        return true;
    }
}