class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        // for(int i =0;i<s.length();i++){
        //     freq[i] = 0;
        // }
        int left = 0;
        int max = 0;
        for(int right =0;right<s.length();right++){
            char rightChar=s.charAt(right);
            freq[rightChar-'a']++;
            while(freq[rightChar-'a']>2){
                char leftChar = s.charAt(left);
                freq[leftChar-'a']--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}