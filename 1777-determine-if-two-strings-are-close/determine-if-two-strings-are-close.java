class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        Set <Character> set = new HashSet<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i =0;i<word1.length();i++){
            char ch = word1.charAt(i);
            set.add(ch);
            arr1[ch - 'a']++;
        }
        for(int i =0;i<word2.length();i++){
            char ch = word2.charAt(i);
            arr2[ch - 'a']++;
            if(!set.contains(ch)) return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}