class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq1 = new int[26];
        for(int i =0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int left = 0;
        int[] freq2 = new int[26];
        for(int right = 0;right < s2.length();right++){
            freq2[s2.charAt(right)-'a']++;
            if(right - left+1 > s1.length()){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right - left+1 == s1.length()){
                boolean isSame = isSame(freq1,freq2);
                if(isSame) return true;
            }
        }
        return false;
    }
    private boolean isSame(int[] freq1,int[] freq2){
        for(int i = 0;i<26;i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}