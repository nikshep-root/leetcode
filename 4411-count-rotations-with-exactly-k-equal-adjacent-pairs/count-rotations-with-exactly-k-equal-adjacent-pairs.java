class Solution {
    public int countRotations(String s, int k) {
        if(s.length() <= 1) return 0;
        int equal = 0;
        for(int i =0;i<s.length();i++){
            int next = (i+1)%s.length();
            if(s.charAt(i)==s.charAt(next)){
                equal++;
            }
        }
        int unequal = s.length()-equal;
        if(k==equal-1) return equal;
        if(k==equal) return unequal;
        return 0;
    }
}