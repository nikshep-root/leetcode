class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        int count = 0;
        int[] freq = new int[26];
        for(int i =0;i<3;i++){
            freq[s.charAt(i)-'a']++;
        }
        if(isDistinct(freq)){
            count++;
        }
        for(int i = 3;i<s.length();i++){
            char incoming = s.charAt(i);
            char outgoing = s.charAt(i-3);
            freq[incoming-'a']++;
            freq[outgoing-'a']--;
            if(isDistinct(freq)){
                count++;
            }
        }
        return count;
    }
    private boolean isDistinct(int[] freq){
        for(int count : freq){
            if(count > 1) return false;
        }
        return true;
    }
}