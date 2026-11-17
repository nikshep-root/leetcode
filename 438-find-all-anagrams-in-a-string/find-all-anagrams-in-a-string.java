class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        for(int i =0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        int left = 0;
        int[] freq2 = new int[26];
        ArrayList<Integer> list = new ArrayList<>();
        for(int right = 0;right < s.length();right++){
            freq2[s.charAt(right)-'a']++;
            if(right - left+1 > p.length()){
                freq2[s.charAt(left)-'a']--;
                left++;
            }
            if(right - left+1 == p.length()){
                boolean isSame = isSame(freq1,freq2);
                if(isSame) list.add(left);
            }
        }
        return list;
    }
    private boolean isSame(int[] freq1,int[] freq2){
        for(int i = 0;i<26;i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}