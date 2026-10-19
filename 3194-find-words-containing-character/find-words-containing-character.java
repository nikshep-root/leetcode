class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<words.length;i++){
            String s = words[i];
            for(int j =0;j<s.length();j++){
                char ch = s.charAt(j);
                if(ch == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}