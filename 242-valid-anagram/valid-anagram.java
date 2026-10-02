class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i =0;i<26;i++){
            freq1[i] = 0;
            freq2[i] = 0;
        }
        for(int i =0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
        }
        for(int i =0;i<26;i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}