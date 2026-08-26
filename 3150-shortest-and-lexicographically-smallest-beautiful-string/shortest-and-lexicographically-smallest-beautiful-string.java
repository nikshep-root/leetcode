class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int countOnes = 0;
        String ans = "";
        for(int right = 0;right < s.length();right++){
            char ch = s.charAt(right);
            if(ch == '1'){
                countOnes++;
            }
            while(countOnes > k) {
                if(s.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
            while(countOnes == k && s.charAt(left) == '0'){
                left++;
            }
            if(countOnes == k){
                String sub = s.substring(left,right+1);
                if(ans.isEmpty()||sub.length()<ans.length()||(sub.length()==ans.length()&&sub.compareTo(ans)<0)){
                    ans = sub;
                }
            }
        }
        return ans;
    }
}