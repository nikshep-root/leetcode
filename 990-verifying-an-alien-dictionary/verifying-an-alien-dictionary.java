class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int assign = 0;
        int[] prio = new int[26];
        for(int i =0;i<order.length();i++){
            prio[order.charAt(i)-'a'] = assign;
            assign++;
        }
        for(int i =0;i<words.length-1;i++){
            String word1 = words[i];
            String word2 = words[i + 1];
            boolean foundDifference = false;
            int minLen = Math.min(word1.length(),word2.length());
            for(int k =0;k<minLen;k++){
                char c1 = word1.charAt(k);
                char c2 = word2.charAt(k);
                if(c1 != c2) {
                    if(prio[c1 - 'a'] > prio[c2 - 'a']){
                        return false;
                    }
                    foundDifference = true;
                    break; 
                }
            }
            if(!foundDifference && word1.length() > word2.length()){
                return false;
            }
        }
        return true;
    }
}