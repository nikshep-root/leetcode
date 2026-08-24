class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int cnt = 0;
        int left = 0;
        int maxLen = 1;
        for(int right = 0;right<s.length();right++){
            if(right != 0 && s.charAt(right - 1) == s.charAt(right)){
                cnt++;
            }
            while(cnt > 1){
                if(right>left && s.charAt(left) == s.charAt(left+1)){
                    cnt--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}